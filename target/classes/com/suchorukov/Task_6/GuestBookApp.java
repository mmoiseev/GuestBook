package com.suchorukov.Task_6;

import com.suchorukov.Task_6.UI.GuestBookConsoleReader;
import com.suchorukov.Task_6.UI.GuestBookInput;

public class GuestBookApp {
    public static void main(String[] args) {
        //GuestBookUIController();
        GuestBookInput dw = new GuestBookConsoleReader();
        dw.getCommand();
    }
}
