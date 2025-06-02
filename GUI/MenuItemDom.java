package GUI;

import java.awt.*;
import javax.swing.*;

public class MenuItemDom {
public static void main(String args[]) {
JMenu menu, submenu, edit, view, go, run;
JMenuItem item1, item2, item3, item4, item5;
JFrame jframe = new JFrame("Advanced Programming Menu and MenuItem Demonestration");
JMenuBar mb = new JMenuBar();
JLabel jlabel = new JLabel("Advanced Programming");
jlabel.setBounds(50, 100, 400, 100);
jlabel.setFont(new Font("Poppins", Font.PLAIN, 30));
menu = new JMenu("File");
edit = new JMenu("Edit");
view = new JMenu("View");
go = new JMenu("Go");
run = new JMenu("Run");
submenu = new JMenu("Preferences");
item1 = new JMenuItem("New File ...");
item2 = new JMenuItem("Open Folder");
item3 = new JMenuItem("Save");
item4 = new JMenuItem("Profile");
item5 = new JMenuItem("Setting");
menu.add(item1);
menu.add(item2);
menu.add(item3);
submenu.add(item4);
submenu.add(item5);
menu.add(submenu);
mb.add(menu);
mb.add(edit);
mb.add(view);
mb.add(go);
mb.add(run);
jframe.add(jlabel);
jframe.setJMenuBar(mb);
jframe.setSize(800, 400);
jframe.setLayout(null);
jframe.setVisible(true);
}
};
