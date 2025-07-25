import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {

    Label label;
    Button button;

    AWTExample() {
        // Set frame properties
        setTitle("AWT Demo");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        // Create a label
        label = new Label("Click the button");
        label.setBounds(50, 50, 200, 30);
        add(label);

        // Create a button
        button = new Button("Click Me!");
        button.setBounds(90, 100, 100, 40);
        add(button);

        // Add event listener
        button.addActionListener(this);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
