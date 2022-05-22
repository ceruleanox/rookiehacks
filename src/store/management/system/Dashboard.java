package store.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{

    public Dashboard() {
        setBounds(0, 0, 1300, 775);
        setLayout(null);

        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icons/background_room.jpg"));
        Image bg_image = bg.getImage().getScaledInstance(1300, 775, Image.SCALE_DEFAULT);
        ImageIcon bg_img = new ImageIcon(bg_image);
        JLabel image = new JLabel(bg_img);
        image.setBounds(0, 0, 1300, 775);
        add(image);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1300, 30);
        mb.setBackground(Color.DARK_GRAY);
        image.add(mb);

        JMenu store = new JMenu("STORE MANAGEMENT");
        store.setForeground(Color.CYAN);
        mb.add(store);

        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(openReceptionScreen());
        store.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.ORANGE);
        mb.add(admin);

        JMenuItem addEmployee = new JMenuItem("ADD EMPLOYEE");
        addEmployee.addActionListener(openEmployeeScreen());
        admin.add(addEmployee);

        JMenuItem addItem = new JMenuItem("ADD ITEM");
        admin.add(addItem);

        JMenuItem addBorrower = new JMenuItem("ADD BORROWER");
        admin.add(addBorrower);

        setVisible(true);
    }

    private ActionListener openReceptionScreen() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Reception();
            }
        };
    }

    private ActionListener openEmployeeScreen() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addEmployees();
            }
        };
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
