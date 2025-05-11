import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWebsiteGUI {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("My Simple Website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel for the header
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180));
        headerPanel.setPreferredSize(new Dimension(800, 80));

        JLabel titleLabel = new JLabel("Welcome to My Website");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        headerPanel.add(titleLabel);

        // Create a panel for navigation buttons
        JPanel navPanel = new JPanel();
        navPanel.setBackground(new Color(220, 220, 220));
        navPanel.setPreferredSize(new Dimension(800, 50));

        // Create navigation buttons
        JButton homeButton = new JButton("Home");
        JButton aboutButton = new JButton("About");
        JButton contactButton = new JButton("Contact");

        navPanel.add(homeButton);
        navPanel.add(aboutButton);
        navPanel.add(contactButton);

        // Create a content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        JTextArea contentArea = new JTextArea();
        contentArea.setEditable(false);
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(contentArea);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        // Set initial content
        contentArea.setText("Welcome to the home page!\n\nThis is a simple website-like interface created with Java Swing.\n\nClick the navigation buttons to see different content.");

        // Add action listeners to buttons
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentArea.setText("Welcome to the home page!\n\nThis is a simple website-like interface created with Java Swing.\n\nClick the navigation buttons to see different content.");
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentArea.setText("About Us\n\nThis is a sample 'About' page.\n\nJava Swing provides components to create graphical user interfaces.\n\nThis example shows how to create a simple website layout.");
            }
        });

        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentArea.setText("Contact Information\n\nEmail: contact@example.com\nPhone: (123) 456-7890\nAddress: 123 Main St, Java City");
            }
        });

        // Add panels to frame
        frame.setLayout(new BorderLayout());
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(navPanel, BorderLayout.CENTER);
        frame.add(contentPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
