import javax.swing.*;
import java.awt.*;

public class LayoutProgram {
    public static void main (String[]args){
        JFrame jf= new JFrame();
        JButton jb1= new JButton("North");
        JButton jb2= new JButton("East");
        JButton jb3= new JButton("West");
        JButton jb4= new JButton("South");
        JButton jb5= new JButton("Center");

        jf.add (jb1, BorderLayout.NORTH);
        jf.add (jb2, BorderLayout.EAST);
        jf.add (jb3, BorderLayout.WEST);
        jf.add (jb4, BorderLayout.SOUTH);
        jf.add (jb5, BorderLayout.CENTER);
        jf.setVisible(true);
        jf.setSize(25,25);



    }
}
