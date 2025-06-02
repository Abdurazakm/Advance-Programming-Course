package GUI;

import javax.swing.*;

public class TableDomantstate {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("Advanced Program JTable");
        JLabel jlabel = new JLabel("Table Demonestration");
        jlabel.setBounds(50, 0, 200, 300);
        String data[][] = {
                { "1", "Year I", "Software Engineering", "200", "180" },
                { "2", "Year II", "Mechanical Engineering", "240", "200" },
                { "3", "Year III", "Software Engineering", "400", "350" },
                { "4", "Year IV", "Civil Engineering", "200", "180" },
        };
        String column[] = { "NO", "Batch", "Department", "Total_NO_Student",
                "Active" };
        JTable jtable = new JTable(data, column);
        jtable.setBounds(50, 100, 200, 300);
        jframe.add(jlabel);
        JScrollPane scroll = new JScrollPane(jtable);
        jframe.add(scroll);
        jframe.setSize(700, 300);
        jframe.setVisible(true);
    }
};