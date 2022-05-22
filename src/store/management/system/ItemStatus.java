package store.management.system;

import javax.swing.*;
import java.awt.*;

public class ItemStatus extends JFrame {

    public ItemStatus() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        showUiComponents();

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    private void showUiComponents() {
        JLabel lblItemCode = new JLabel("Item Name");
        lblItemCode.setBounds(50, 30, 100, 30);
        lblItemCode.setBackground(Color.BLACK);
        add(lblItemCode);

        JTextField empName = new JTextField();
        empName.setBounds(120, 30, 100, 30);
        add(empName);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50, 30, 100, 30);
        lblAddress.setBackground(Color.BLACK);
        add(lblAddress);

        JTextField address = new JTextField();
        address.setBounds(120, 80, 100, 30);
        add(address);

        JLabel lblContact = new JLabel("Contact");
        lblAddress.setBounds(50, 120, 100, 30);
        lblContact.setBackground(Color.BLACK);
        add(lblContact);

        JTextField contact = new JTextField();
        contact.setBounds(120, 120, 100, 30);
        add(contact);
    }

    public static void main(String[] args) {
        new ItemStatus();
    }
}
