package store.management.system;

import javax.swing.*;
import java.awt.*;

public class Reception extends JFrame {
    public Reception() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JButton newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        add(newCustomer);

        JButton items = new JButton("Items");
        items.setBounds(10, 70, 200, 30);
        items.setBackground(Color.BLACK);
        items.setForeground(Color.WHITE);
        add(items);

        JButton departments = new JButton("Departments");
        departments.setBounds(10, 110, 200, 30);
        departments.setBackground(Color.BLACK);
        departments.setForeground(Color.WHITE);
        add(departments);

        JButton employees = new JButton("Employees");
        employees.setBounds(10, 150, 200, 30);
        employees.setBackground(Color.BLACK);
        employees.setForeground(Color.WHITE);
        add(employees);

        JButton customers = new JButton("Customers");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        add(customers);

        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10, 230, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);

        JButton updateStatus = new JButton("Update Item Status");
        updateStatus.setBounds(10, 270, 200, 30);
        updateStatus.setBackground(Color.BLACK);
        updateStatus.setForeground(Color.WHITE);
        add(updateStatus);

        JButton searchItem = new JButton("Search Item");
        searchItem.setBounds(10, 310, 200, 30);
        searchItem.setBackground(Color.BLACK);
        searchItem.setForeground(Color.WHITE);
        add(searchItem);

        JButton logout = new JButton("Logout");
        logout.setBounds(10, 350, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);

        ImageIcon checkNGo = new ImageIcon(ClassLoader.getSystemResource("./icons/splash.png"));
        Image img = checkNGo.getImage().getScaledInstance(500, 470, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(img));
        image.setBounds(250, 30, 500, 470);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
