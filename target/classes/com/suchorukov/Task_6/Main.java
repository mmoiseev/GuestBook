package com.suchorukov.Task_6;

import java.sql.*;

public class Main {
    static final String CREATE_TABLE = "CREATE TABLE ";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:mem:mydatabase", "user1", "password1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        ResultSet array = connection.createStatement().executeQuery(CREATE_TABLE);

        //if (array.next())
        //System.out.print(array.getDouble(1));
    }
}
