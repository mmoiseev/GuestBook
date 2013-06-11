package com.suchorukov.Task_6;

import com.suchorukov.Task_6.DataBase.GuestBookDB;
import com.suchorukov.Task_6.DataBase.H2;
import com.suchorukov.Task_6.UI.GuestBookConsoleDisplay;
import com.suchorukov.Task_6.UI.GuestBookConsoleReader;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        Connection connection = null;
        String driver = "jdbc:h2:mem";
        String database = "mydatabase";
        String user = "user1";
        String pass = "password1";
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(driver + ":" + database, user, pass);
            GuestBookDB db = new H2(connection);
            db.createTable();
            new  GuestBookUIController(new GuestBookConsoleReader(), new GuestBookConsoleDisplay(), new GuestBook(db));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {}
        }


    }
}
