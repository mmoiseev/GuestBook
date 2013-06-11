package com.suchorukov.Task_6.database;

import com.suchorukov.Task_6.Record;

import java.sql.SQLException;
import java.util.List;

public interface GuestBookDB {
    void createTable() throws SQLException;
    void addRecord(String message) throws SQLException;
    List<Record> getRecords() throws SQLException;

}
