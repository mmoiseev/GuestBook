package com.suchorukov.Task_6;

import com.suchorukov.Task_6.UI.GuestBookConsoleDisplay;
import com.suchorukov.Task_6.UI.GuestBookConsoleReader;

public class GuestBookApp {
    public static void main(String[] args) {
        new  GuestBookUIController(new GuestBookConsoleReader(), new GuestBookConsoleDisplay());

    }
}
