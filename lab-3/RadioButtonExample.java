import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");

        // Create radio buttons
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100, 50, 100, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 50, 100, 30);

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Add to frame
        frame.add(male);
        frame.add(female);

        frame.setSize(400, 200);
        frame.setLayout(null); // No layout manager
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
