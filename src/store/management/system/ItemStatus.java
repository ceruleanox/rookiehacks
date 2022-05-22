package store.management.system;

import store.management.model.Item;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class ItemStatus extends JFrame {

    public ItemStatus() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        try {
            showUiComponents();
        } catch (Exception e) {

        }

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    private void showUiComponents() throws SQLException {
        conn conn = new conn();
        List<Item> items = conn.getItemNames();
    }

    public static void main(String[] args) {
        new ItemStatus();
    }
}
