package com.suchorukov.guestBook;

import com.suchorukov.guestBook.database.GuestBookDB;
import com.suchorukov.guestBook.database.H2;
import com.suchorukov.guestBook.userDialog.ConsoleDisplay;
import com.suchorukov.guestBook.userDialog.ConsoleReader;

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
            new UIController(new ConsoleReader(), new ConsoleDisplay(), new BusinessController(db));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)connection.close();
            } catch (SQLException e) {}
        }


    }
}
