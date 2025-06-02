package GUI;

import javax.swing.*;

public class jframe {
    public static void main(String[] args) {
        // create a JFrame object
        JFrame jframe = new JFrame("Advanced programming JFrame InstanceExample");
        // create instance of JButton
        JButton btn = new JButton("Hit Me using Approch 2");
        // dimensions of JButton object
        btn.setBounds(100, 50, 200, 40);
        jframe.add(btn);// add button in JFrame
        // set frame width = 300 and height = 200
        jframe.setSize(300, 200);
        jframe.setLayout(null);
        jframe.setVisible(true);// make the frame visible
    }
}
