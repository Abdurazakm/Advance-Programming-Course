import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener, KeyListener {

    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 28));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(new Color(30, 30, 30));
        textField.setForeground(Color.WHITE);
        textField.addKeyListener(this);
        add(textField, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 5, 5));
        buttonPanel.setBackground(new Color(40, 40, 40));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "√", "x²", "←", "AC"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setBackground(new Color(60, 63, 65));
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handleInput(e.getActionCommand());
    }

    private void handleInput(String input) {
        if (input.matches("[0-9]")) {
            textField.setText(textField.getText() + input);
        } else if (input.equals(".")) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (input.matches("[+\\-*/]")) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = input;
                textField.setText("");
            }
        } else if (input.equals("=") || input.equals("\n")) {
            if (!textField.getText().isEmpty() && operator != null) {
                try {
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/":
                            if (num2 == 0) {
                                textField.setText("Error");
                                return;
                            }
                            result = num1 / num2;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    operator = null;
                } catch (Exception ex) {
                    textField.setText("Error");
                }
            }
        } else if (input.equals("AC")) {
            textField.setText("");
            num1 = num2 = result = 0;
            operator = null;
        } else if (input.equals("←") || input.equals("BACKSPACE")) {
            String current = textField.getText();
            if (!current.isEmpty()) {
                textField.setText(current.substring(0, current.length() - 1));
            }
        } else if (input.equals("√")) {
            try {
                double value = Double.parseDouble(textField.getText());
                if (value < 0) {
                    textField.setText("Error");
                } else {
                    result = Math.sqrt(value);
                    textField.setText(String.valueOf(result));
                }
            } catch (Exception ex) {
                textField.setText("Error");
            }
        } else if (input.equals("x²")) {
            try {
                double value = Double.parseDouble(textField.getText());
                result = value * value;
                textField.setText(String.valueOf(result));
            } catch (Exception ex) {
                textField.setText("Error");
            }
        }
    }

    // Keyboard support
    @Override
    public void keyPressed(KeyEvent e) {
        char ch = e.getKeyChar();
        int keyCode = e.getKeyCode();

        if (Character.isDigit(ch)) {
            handleInput(String.valueOf(ch));
        } else if (ch == '.') {
            handleInput(".");
        } else if (ch == '+') {
            handleInput("+");
        } else if (ch == '-') {
            handleInput("-");
        } else if (ch == '*') {
            handleInput("*");
        } else if (ch == '/') {
            handleInput("/");
        } else if (keyCode == KeyEvent.VK_ENTER) {
            handleInput("=");
        } else if (keyCode == KeyEvent.VK_BACK_SPACE) {
            handleInput("←");
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calc = new SimpleCalculator();
            calc.setVisible(true);
            calc.textField.requestFocusInWindow();
        });
    }
}
