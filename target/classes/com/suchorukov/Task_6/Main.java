package com.suchorukov.Task_6;

import java.sql.*;

public class Main {
    private static int identifier;
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

        Statement statement = connection.createStatement();
        //statement.executeUpdate("drop table POSTS");
        //System.exit(1);
        int array = statement.executeUpdate("create table if not exists POSTS (ID integer, POSTDATE date, MESSAGE varchar(255))");

        //int upd = statement.executeUpdate("insert into POSTS values(1, '1999-09-09', 'message')");
        //System.out.println(upd);
        //boolean d = statement.execute("insert into POSTS values(2, '1888-08-08', 'message')");
        //System.out.println(d);
        ResultSet res = statement.executeQuery("select * from POSTS");
        //System.out.println(res.getMetaData().getColumnName(0) );
        //boolean s = connection.createArrayOf()

        //if (array.next());

        System.out.println(res.next());
        //while (res.next())
        //System.out.println(res.getRow());
            //System.out.println(res.getInt("ID") + " " + res.getDate("POSTDATE") + " " + res.getString("MESSAGE"));

          //  res.next();
        //System.out.println(res.getDate("POSTDATE"));

        //System.out.print(array.getDouble(1));  */
    }
}
