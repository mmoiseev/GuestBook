package com.suchorukov.Task_6;

import java.util.List;

public interface GuestBookController {
    void addRecord(String message);
    List<Record> getRecords();
}
