package com.suchorukov.Task_6;

import com.suchorukov.Task_6.database.GuestBookDB;

import java.sql.SQLException;
import java.util.*;

public class BusinessController implements GuestBookController{

    private GuestBookDB db;

    public BusinessController(GuestBookDB db) {
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
