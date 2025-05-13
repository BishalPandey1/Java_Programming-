import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculatorr extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input = new StringBuilder();

    public Calculatorr() {
        setTitle("Advanced Calculatorr");
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
                "C", "←", "(", ")"
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
                double result = evaluateExpression(input.toString());
                input = new StringBuilder(Double.toString(result));
                display.setText(input.toString());
            } catch (Exception ex) {
                display.setText("Error");
                input.setLength(0);
            }
        } else if (command.equals("C")) {
            input.setLength(0);
            display.setText("");
        } else if (command.equals("←")) {
            if (input.length() > 0 && !display.getText().equals("Error")) {
                input.deleteCharAt(input.length() - 1);
                display.setText(input.toString());
            }
        } else {
            // Prevent multiple decimals in a number
            if (command.equals(".") && input.toString().matches(".*\\d+\\.\\d*$")) {
                return;
            }
            // Prevent operators at start (except minus)
            if ("+-*/".contains(command) && input.length() == 0 && !command.equals("-")) {
                return;
            }
            input.append(command);
            display.setText(input.toString());
        }
    }

    private double evaluateExpression(String expression) {
        // Implement a safer expression evaluator
        return new ArithmeticParser().parse(expression);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculatorr calc = new Calculatorr();
            calc.setVisible(true);
        });
    }
}

// A simple arithmetic parser (basic implementation)
class ArithmeticParser {
    public double parse(String expression) {
        // Remove all whitespace
        expression = expression.replaceAll("\\s+", "");

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                StringBuilder numBuilder = new StringBuilder();
                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numBuilder.append(expression.charAt(i++));
                }
                i--;
                numbers.push(Double.parseDouble(numBuilder.toString()));
            } else if (c == '(') {
                operations.push(c);
            } else if (c == ')') {
                while (operations.peek() != '(') {
                    numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.pop();
            } else if (isOperator(c)) {
                while (!operations.empty() && hasPrecedence(c, operations.peek())) {
                    numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
        }

        while (!operations.empty()) {
            numbers.push(applyOp(operations.pop(), numbers.pop(), numbers.pop()));
        }

        if (numbers.size() != 1) {
            throw new ArithmeticException("Invalid expression");
        }

        return numbers.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
        }
        throw new ArithmeticException("Unknown operator");
    }
}
