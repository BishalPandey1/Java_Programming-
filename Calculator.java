import javax.swing.*;


public class Calculator {
    public static void main (String[]args)
    {
        JFrame jf= new JFrame("Calculator");
        jf.setSize(1000,1000);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb1= new JButton("CLick me");
        jb1.setBounds(100,500,250,150);
        jf.add(jb1);
        JTextField jb2 = new JTextField();
        jb2.setBounds(10,105,100,150);
        jf.add(jb2);



    }

}
