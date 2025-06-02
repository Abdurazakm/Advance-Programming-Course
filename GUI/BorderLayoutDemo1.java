package GUI;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo1 {
    public static void main(String args[]) {
        JFrame jframe = new JFrame(
                "Advanced Programming BorderLayout!");
        JButton jbtn1 = new JButton("Button1");
        JButton jbtn2 = new JButton("Button2");
        JButton jbtn3 = new JButton("Button3");
        JButton jbtn4 = new JButton("Button4");
        JButton jbtn5 = new JButton("Button5");
        JButton jbtn6 = new JButton("Button6");
        jframe.setLayout(new GridLayout());
        jframe.setLayout(new GridLayout(2, 3));
        jframe.setLayout(new GridLayout(3, 2, 20, 20));
        jframe.add(jbtn1);
        jframe.add(jbtn2);
        jframe.add(jbtn3);
        jframe.add(jbtn4);
        jframe.add(jbtn5);
        jframe.add(jbtn6);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
    }
}
