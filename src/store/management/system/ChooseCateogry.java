package store.management.system;

import javax.swing.*;
import java.awt.*;

public class ChooseCateogry extends  JFrame{
    ChooseCateogry(){
        setLayout(null);
        JLabel lblcategory = new JLabel("Category");
        lblcategory.setBounds(60,180,120,30);
        lblcategory.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblcategory);
        String str[] = {"Automotive & Powersports", "Books", "Camera & Photo", "Consumer Electronics", "Entertainment Collectibles", "Home & Garden", "Music and DVD", "Musical Instruments", "Office Products" , "Tools & Home Improvement", "Toys & Games", "Video Games"};
        JComboBox cbjob = new JComboBox(str);
        cbjob.setBackground(Color.GRAY);
        cbjob.setBounds(200, 180, 150, 30);
        add(cbjob);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
        setVisible(true);
    }
    public static void main(String[] args){
        new ChooseCateogry();
    }
}
