package com.suchorukov.Task_6.DataBase;

import com.suchorukov.Task_6.Record;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GuestBookDB {
    void createTable() throws SQLException;
    void addRecord(String message) throws SQLException;
    List<Record> getRecords() throws SQLException;

}
