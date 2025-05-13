import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatorr extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input = new StringBuilder();

    public Calculator() {
        setTitle("Advanced Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "←"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("=")) {
            try {
                input = new StringBuilder(Double.toString(eval(input.toString())));
            } catch (Exception ex) {
                input = new StringBuilder("Error");
            }
            display.setText(input.toString());
        } else if (command.equals("C")) {
            input.setLength(0);
            display.setText("");
        } else if (command.equals("←")) {
            if (input.length() > 0) {
                input.deleteCharAt(input.length() - 1);
                display.setText(input.toString());
            }
        } else {
            input.append(command);
            display.setText(input.toString());
        }
    }

    private double eval(String expression) {
        return new javax.script.ScriptEngineManager()
                .getEngineByName("JavaScript")
                .eval(expression);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}
