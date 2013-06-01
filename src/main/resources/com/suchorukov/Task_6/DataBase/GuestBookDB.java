package com.suchorukov.Task_6.DataBase;

import com.suchorukov.Task_6.Record;

import java.sql.Connection;
import java.util.List;

public interface GuestBookDB {
    boolean checkDBExist(String dbName);
    void createDB(String dbName);
    void createTable(String tableName);
    void addRecord(String[] parameters);
    List<Record> getRecords();

}
