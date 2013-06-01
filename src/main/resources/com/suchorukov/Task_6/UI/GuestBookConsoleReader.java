package com.suchorukov.Task_6.UI;

import java.io.InputStream;
import java.util.Scanner;

public class GuestBookConsoleReader implements GuestBookInput {
    private Scanner scanner;

    public GuestBookConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public String getCommand() {
        return scanner.nextLine();
    }
}
