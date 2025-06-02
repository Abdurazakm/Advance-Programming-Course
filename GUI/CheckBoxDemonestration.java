package GUI;

import javax.swing.*;

public class CheckBoxDemonestration {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Programming JCheckbox");
        JLabel label = new JLabel("Check Box Demonestration");
        label.setBounds(100, 50, 200, 50);
        JCheckBox checkBox1 = new JCheckBox("Core Jave");
        checkBox1.setBounds(100, 90, 150, 50);
        JCheckBox checkBox2 = new JCheckBox("Advanced Java", true);
        checkBox2.setBounds(100, 130, 150, 50);
        JCheckBox checkBox3 = new JCheckBox("Django Framework");
        checkBox3.setBounds(100, 170, 150, 50);
        jframe.add(label);
        jframe.add(checkBox1);
        jframe.add(checkBox2);
        jframe.add(checkBox3);
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
};