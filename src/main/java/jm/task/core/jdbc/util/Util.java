package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Mytest?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }

}


