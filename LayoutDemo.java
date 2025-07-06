import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 🔹 FlowLayout Panel
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // 🔹 GridLayout Panel
        JPanel gridPanel = new JPanel(new GridLayout(2, 2, 5, 5)); // 2x2 grid
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        gridPanel.add(new JLabel("Label 1"));
        gridPanel.add(new JTextField("Text 1"));
        gridPanel.add(new JLabel("Label 2"));
        gridPanel.add(new JTextField("Text 2"));

        // 🔹 Main layout: BorderLayout
        frame.add(flowPanel, BorderLayout.NORTH);
        frame.add(gridPanel, BorderLayout.CENTER);
        frame.add(new JButton("South Button"), BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
