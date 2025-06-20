import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Calculator {
    public static void main (String[]args)
    {
        JFrame jf= new JFrame("Calculator");
        jf.setSize(1000,1000);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1= new JButton("CLick me");
        jb1.setBounds(50,50,100,100);
        jf.add(jb1);

        JTextField jb2 = new JTextField();
        jb2.setBounds(150,150,100,100);
        jf.add(jb2);

        JTextField jb21 = new JTextField();
        jb21.setBounds(250,250,100,100);
        jf.add(jb21);

        JLabel jbl = new JLabel("Answer with display");
        jb1.setBounds(350,350,100,100);
//        jf.add(ans);
//        jf.setLayout(null);
//        jf.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
}


