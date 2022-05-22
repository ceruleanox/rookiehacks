package store.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchItem extends JFrame implements ActionListener {
    SearchItem(){
        JTable table;
        JButton back, submit;
        JComboBox itemtype;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel search = new JLabel("Search fot Items");
        search.setFont(new Font("Tahoma", Font.PLAIN, 20));
        search.setBounds(400,30,200,30);
        add(search);

        JLabel l1 = new JLabel("Item Number");
        l1.setBounds(50,160,700,20);
        add(l1);

        JLabel l2= new JLabel("Availability");
        l2.setBounds(270,160,700,20);
        add(l2);

        JLabel l3 = new JLabel("Price");
        l3.setBounds(450,160,700,20);
        add(l3);


        JLabel lblitem = new JLabel("Item Type");
        lblitem.setBounds(50,100,100,20);
        add(lblitem);

        String str[] = {"Select the Item", "Musical Items","Sports Items","Electronic Items","Stationary Items","Other Items"};
        itemtype = new JComboBox(str);
        itemtype.setBounds(150,100,150,25);
        itemtype.setBackground(Color.WHITE);
        add(itemtype);

        table = new JTable();
        table.setBounds(0,200,1000,300);
        add(table);

        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from item");
        }catch (Exception e){
            e.printStackTrace();
        }

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(300,520,120,30);
        add(submit);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(500,520,120,30);
        add(back);

        setBounds(300,200,1000,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
    }

    public static void main(String[] args) {
        new SearchItem();

    }
}
