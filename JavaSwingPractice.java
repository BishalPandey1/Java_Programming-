import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwingPractice {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Java Swing Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a JLabel
        JLabel label = new JLabel("Enter your text:");

        // Create a JTextField
        JTextField textField = new JTextField(20);

        // Create a JButton
        JButton button = new JButton("Submit");

        // Create a JLabel to display the output
        JLabel outputLabel = new JLabel("");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from the text field and display it
                outputLabel.setText("You entered: " + textField.getText());
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(outputLabel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
