package store.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AddItem extends JFrame {
    AddItem(){
        setLayout(null);
        JLabel itemName = new JLabel("Item Name");
        itemName.setBounds(60,30,120,30);
        itemName.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfItemName = new JTextField();
        tfItemName.setBounds(200,30,150,30);
        tfItemName.setBorder(new LineBorder(Color.black,1));
        add(tfItemName);
        JLabel ownerID = new JLabel("Owner ID");
        ownerID.setBounds(60,80,120,30);
        ownerID.setFont(new Font("Tahoma", Font.PLAIN, 17));
        JTextField tfOwner = new JTextField();
        tfOwner.setBounds(200,80,150,30);
        tfOwner.setBorder(new LineBorder(Color.black,1));
        add(ownerID);
        add(tfOwner);
        JLabel lblcategory = new JLabel("Category");
        lblcategory.setBounds(60,140,120,30);
        lblcategory.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblcategory);
        String str[] = {"Automotive & Powersports", "Books", "Camera & Photo", "Consumer Electronics", "Entertainment Collectibles", "Home & Garden", "Music and DVD", "Musical Instruments", "Office Products" , "Tools & Home Improvement", "Toys & Games", "Video Games"};
        JComboBox cbjob = new JComboBox(str);
        cbjob.setBackground(Color.GRAY);
        cbjob.setBounds(200, 140, 150, 30);
        add(cbjob);

        add(itemName);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
        setVisible(true);
        

    }
    public static void main(String[] args){
         new AddItem();
    }
}
