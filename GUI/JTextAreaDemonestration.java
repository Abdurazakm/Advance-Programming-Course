package GUI;

import javax.swing.*;

public class JTextAreaDemonestration {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("JTextFiled GUI");
        JPanel jpanel = new JPanel();
        jpanel.setBounds(10, 200, 250, 100);
        JTextArea txtarea = new JTextArea(
                "JTextArea with deafult string value", 10, 20);
        txtarea.setBounds(0, 30, 200, 200);
        jpanel.add(txtarea);
        jframe.add(jpanel);
        jframe.setSize(400, 400);
        jframe.setVisible(true);
        jframe.setLayout(null);
    }
};
