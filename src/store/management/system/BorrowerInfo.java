package store.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BorrowerInfo extends JFrame {
    BorrowerInfo(){
        setLayout(null);
        JLabel borrowerName = new JLabel("Name");
        borrowerName.setBounds(60,30,120,30);
        borrowerName.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfborrowerName = new JTextField();
        tfborrowerName.setBounds(200,30,150,30);
        tfborrowerName.setBorder(new LineBorder(Color.black,1));
        add(borrowerName);
        add(tfborrowerName);

        JLabel borrowerID = new JLabel("ID");
        borrowerID.setBounds(60,80,120,30);
        borrowerID.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfborrowerID = new JTextField();
        tfborrowerID.setBounds(200,80,150,30);
        tfborrowerID.setBorder(new LineBorder(Color.black,1));
        add(borrowerID);
        add(tfborrowerID);

        JLabel borrowerCity = new JLabel("City");
        borrowerCity.setBounds(60,120,120,30);
        borrowerCity.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfborrowerCity = new JTextField();
        tfborrowerCity.setBounds(200,120,150,30);
        tfborrowerCity.setBorder(new LineBorder(Color.black,1));
        getContentPane().setBackground(Color.WHITE);
        add(borrowerCity);
        add(tfborrowerCity);

        JLabel borrowerEmail = new JLabel("City");
        borrowerEmail.setBounds(60,160,120,30);
        borrowerEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfborrowerEmail = new JTextField();
        tfborrowerEmail.setBounds(200,160,150,30);
        tfborrowerEmail.setBorder(new LineBorder(Color.black,1));
        getContentPane().setBackground(Color.WHITE);
        add(borrowerEmail);
        add(tfborrowerEmail);

        JButton submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.GREEN);
        submit.setBounds(200,200,150,60);
        add(submit);
        setBounds(350, 200, 850, 540);
        setVisible(true);

    }
    public static void main(String[] args){
        new BorrowerInfo();
    }}
