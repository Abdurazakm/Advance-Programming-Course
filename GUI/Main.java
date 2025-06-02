package GUI;

import javax.swing.*;

class JframeDemoApprochOne extends JFrame {
    JframeDemoApprochOne() {
        // create button object
        JButton button = new JButton("Hit Me!");
        button.setBounds(100, 50, 150, 40);
        add(button);// add button on frame
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new JframeDemoApprochOne(); // create an object of FrameInherited class
    }
}