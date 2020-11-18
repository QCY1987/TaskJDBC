package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    public Util() {
        String url = "jdbc:mysql://localhost:3306/Mytest?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Молодец, соединение с БД успешно установлено");
            } catch(Exception ex){
                System.out.println("Ошибка, не удалось выполнить соединение с БД");
            ex.printStackTrace();
            }

        }

        }


