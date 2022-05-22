package store.management.system;

import store.management.model.Item;
import store.management.type.BorrowStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///storeMgmtSystem?characterEncoding=utf8", "root", "");
            s = c.createStatement();

        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public List<Item> getItemNames() throws SQLException {
        ResultSet rs = this.s.executeQuery("SELECT * from items");

        List<Item> items = new ArrayList<>();
        while (rs.next()) {
            Item item = new Item();
            item.setId(rs.getInt(0));
            item.setName(rs.getString(1));
            item.setBorrowStatus(BorrowStatus.checkStatus(rs.getString(8)));

            items.add(item);
        }

        return items;
    }
}
