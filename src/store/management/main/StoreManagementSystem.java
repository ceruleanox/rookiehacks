package store.management.main;

import store.management.system.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class StoreManagementSystem extends JFrame implements ActionListener {

    StoreManagementSystem() {
        // setSize(960,  550);
        // setLocation(100, 100);
        setBounds(100, 100, 960, 550);
        setLayout(null);

        ImageIcon splash = new ImageIcon(ClassLoader.getSystemResource("icons/splash.png"));
        JLabel image = new JLabel(splash);
        image.setBounds(0,0, 960, 540);
        add(image);

        JLabel text = new JLabel("Store Management System");
        text.setBounds(330, 320, 1000, 55);
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("dialog", Font.PLAIN, 50));
        image.add(text);

        JButton start = new JButton("START");
        start.setBounds(530, 399, 150, 50);
        start.setBackground(Color.WHITE);
        start.setForeground(Color.DARK_GRAY);
        start.setFont(new Font("dialog", Font.BOLD, 20));
        start.addActionListener(this);
        image.add(start);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new StoreManagementSystem();
    }
}
