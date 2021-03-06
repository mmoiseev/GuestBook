package com.suchorukov.Task_6;

import com.suchorukov.Task_6.DataBase.GuestBookDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class GuestBook  implements GuestBookController{

    private GuestBookDB db;

    public GuestBook(GuestBookDB db) {
        if (db == null)
            throw new IllegalArgumentException("Не инициализирован контроллер базы данных");

        this.db = db;
    }

    public void addRecord(String message) {
        try {
            db.addRecord(message);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Record> getRecords() {
        List<Record> list = new ArrayList<Record>();
        try {
            list = db.getRecords();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
