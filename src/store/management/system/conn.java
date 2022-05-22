package store.management.system;

import java.sql.*;

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

    public void getItemNames() throws SQLException {
        ResultSet rs = this.s.executeQuery("SELECT * from items");

        if (rs.next()) {
            
        }
    }
}
