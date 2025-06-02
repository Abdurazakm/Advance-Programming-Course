package GUI;

import javax.swing.*;

public class JComboBoxDemonstration {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Programming JComboBox");
        JLabel label = new JLabel("Select department:");
        label.setBounds(50, 50, 200, 50);
        String department[] = {
                "Software Engineering", "Mechanical Engineering",
                "Civil Engineering", "Electromechanical Engineering",
                "Chemical Engineering"
        };
        JComboBox box = new JComboBox<>(department);
        box.setBounds(50, 100, 200, 40);
        jframe.add(box);
        jframe.add(label);
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}
