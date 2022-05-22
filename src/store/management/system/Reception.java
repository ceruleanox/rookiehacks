package store.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    public Reception() {
        getContentPane().setBackground(Color.WHITE);

        ImageIcon checkNGo = new ImageIcon(ClassLoader.getSystemResource("./icons/storeRegister.PNG"));
        Image img = checkNGo.getImage().getScaledInstance(500, 470, Image.SCALE_DEFAULT);

        setLayout(null);
        setTitle("Check n' Go");
        setIconImage(img);

        JButton newCustomer = new JButton("New Borrower Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        add(newCustomer);

        JButton items = new JButton("Items");
        items.setBounds(10, 70, 200, 30);
        items.setBackground(Color.BLACK);
        items.setForeground(Color.WHITE);
        add(items);

        JButton departments = new JButton("Category");
        departments.setBounds(10, 110, 200, 30);
        departments.setBackground(Color.BLACK);
        departments.setForeground(Color.WHITE);
        add(departments);

        JButton employees = new JButton("Employees");
        employees.addActionListener(openEmployeeScreen());
        employees.setBounds(10, 150, 200, 30);
        employees.setBackground(Color.BLACK);
        employees.setForeground(Color.WHITE);
        add(employees);

        JButton customers = new JButton("Borrower Info");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        add(customers);

        JButton managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        add(managerInfo);

        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10, 230, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);

        JButton itemStatus = new JButton("Item Status");
        itemStatus.setBounds(10, 270, 200, 30);
        itemStatus.setBackground(Color.BLACK);
        itemStatus.setForeground(Color.WHITE);
        add(itemStatus);

        JButton updateStatus = new JButton("Update Item Status");
        updateStatus.setBounds(10, 310, 200, 30);
        updateStatus.setBackground(Color.BLACK);
        updateStatus.setForeground(Color.WHITE);
        add(updateStatus);

        JButton pickupService = new JButton("Pickup Service");
        pickupService.setBounds(10, 350, 200, 30);
        pickupService.setBackground(Color.BLACK);
        pickupService.setForeground(Color.WHITE);
        add(pickupService);

        JButton searchItem = new JButton("Search Item");
        searchItem.addActionListener(openSearchScreen());
        searchItem.setBounds(10, 390, 200, 30);
        searchItem.setBackground(Color.BLACK);
        searchItem.setForeground(Color.WHITE);
        add(searchItem);

        JButton logout = new JButton("Logout");
        logout.setBounds(10, 430, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);

        JLabel image = new JLabel(new ImageIcon(img));
        image.setBounds(250, 30, 500, 470);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
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

    private ActionListener openSearchScreen() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new SearchItem();
            }
        };
    }

    public static void main(String[] args) {
        new Reception();
    }
}
