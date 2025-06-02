package GUI;

import java.awt.*;
import javax.swing.*;

public class PasswordField {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Programming JPasswordField");
        JTextField username = new JTextField();
        JLabel jlabel = new JLabel("Login System");
        JLabel textFiled = new JLabel("Username:");
        JPasswordField password = new JPasswordField();
        JLabel passwordLabel = new JLabel("Password:");
        password.setToolTipText("Enter Password");
        textFiled.setBounds(20, 100, 80, 30);
        username.setBounds(100, 100, 250, 30);
        username.setToolTipText("Enter Username");
        jlabel.setBounds(50, 20, 250, 30);
        jlabel.setFont(new Font("Poppins", Font.PLAIN, 25));
        passwordLabel.setBounds(20, 150, 80, 30);
        password.setBounds(100, 150, 250, 30);
        jframe.add(textFiled);
        jframe.add(username);
        jframe.add(jlabel);
        jframe.add(password);
        jframe.add(passwordLabel);
        jframe.setSize(500, 500);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}
