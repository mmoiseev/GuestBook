package com.suchorukov.Task_6.UI;


import java.io.*;

public class GuestBookConsoleDisplay implements GuestBookOutput{
    private OutputStream out = System.out;
    Writer writer = new OutputStreamWriter(out);

    public void sendResult(String message) throws IOException {
        writer.write(message);
        writer.flush();
    }
}
