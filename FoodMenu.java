import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Food Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(25, 3)); // 20 food items + 5 additional fields

        String[] foodItems = {
            "Burger", "Pizza", "Pasta", "Sandwich", "Fries",
            "Sushi", "Steak", "Salad", "Soup", "Tacos",
            "Rice Bowl", "Curry", "Noodles", "Chicken Wings", "Dumplings",
            "Ice Cream", "Cake", "Smoothie", "Coffee", "Tea"
        };

        JTextField[] quantityFields = new JTextField[20];
        JTextField[] priceFields = new JTextField[20];

        // Adding food items with quantity and price fields
        for (int i = 0; i < foodItems.length; i++) {
            panel.add(new JLabel(foodItems[i]));
            quantityFields[i] = new JTextField("0", 5);
            panel.add(quantityFields[i]);
            priceFields[i] = new JTextField("0.0", 5);
            panel.add(priceFields[i]);
        }

        // Additional fields
        panel.add(new JLabel("Customer Name:"));
        JTextField customerName = new JTextField(10);
        panel.add(customerName);

        panel.add(new JLabel("Table Number:"));
        JTextField tableNumber = new JTextField(5);
        panel.add(tableNumber);

        panel.add(new JLabel("Total Bill:"));
        JTextField totalBill = new JTextField("0.0", 10);
        totalBill.setEditable(false);
        panel.add(totalBill);

        panel.add(new JLabel("Payment Method:"));
        String[] payments = {"Cash", "Credit Card", "Mobile Pay"};
        JComboBox<String> paymentMethod = new JComboBox<>(payments);
        panel.add(paymentMethod);

        panel.add(new JLabel("Order Time:"));
        JTextField orderTime = new JTextField(10);
        panel.add(orderTime);

        JButton calculateButton = new JButton("Calculate Total");
        panel.add(calculateButton);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;
                for (int i = 0; i < foodItems.length; i++) {
                    int quantity = Integer.parseInt(quantityFields[i].getText());
                    double price = Double.parseDouble(priceFields[i].getText());
                    total += quantity * price;
                }
                totalBill.setText(String.valueOf(total));
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
