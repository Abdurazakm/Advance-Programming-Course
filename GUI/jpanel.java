package GUI;

import javax.swing.*;

public class jpanel {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Programming GUI");
        JPanel panelInFrame = new JPanel();
        panelInFrame.setBounds(50, 85, 100, 100);
        JButton button = new JButton("Button in JPanel");
        panelInFrame.add(button);
        JLabel text = new JLabel("Label");
        panelInFrame.add(text);
        jframe.add(panelInFrame);
        jframe.setSize(500, 150);
        jframe.setVisible(true);
        jframe.setLayout(null);
    }
}
