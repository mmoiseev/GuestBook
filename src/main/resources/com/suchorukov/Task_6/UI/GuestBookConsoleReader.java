package com.suchorukov.Task_6.UI;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class GuestBookConsoleReader implements GuestBookInput {
    private InputStream in = System.in;
    private Scanner scanner;

    public GuestBookConsoleReader() {
        scanner = new Scanner(in);
    }

    public String getCommand() {
        return scanner.nextLine();
    }

    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
