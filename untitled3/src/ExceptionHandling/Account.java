package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class Account {
    public Connection getconn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "abc";
        String password = "xyz";
        Collection conn = null;
        conn = (Collection) DriverManager.getConnection(url, user, password);
        return (Connection) conn;

    }

    public void withdraw(int amount) {
        try {
            getconn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
