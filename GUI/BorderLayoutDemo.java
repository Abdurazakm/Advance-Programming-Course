package GUI;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Programming BorderLayout!");
        JButton jbtn1 = new JButton("Region:NORTH");
        JButton jbtn2 = new JButton("Region:SOUTH");
        JButton jbtn3 = new JButton("Region:EAST");
        JButton jbtn4 = new JButton("Region:WEST");
        JButton jbtn5 = new JButton("Region:CENTER");
        jframe.setLayout(new BorderLayout(20, 20));
        jframe.add(jbtn1, BorderLayout.NORTH);
        jframe.add(jbtn2, BorderLayout.SOUTH);
        jframe.add(jbtn3, BorderLayout.EAST);
        jframe.add(jbtn4, BorderLayout.WEST);
        jframe.add(jbtn5, BorderLayout.CENTER);
        jframe.setSize(500, 500);
        jframe.setVisible(true);
    }
}
