package com.suchorukov.Task_6.UI;


import java.io.*;

public class ConsoleDisplay implements GuestBookOutput{
    private OutputStream out = System.out;
    Writer writer = new OutputStreamWriter(out);

    public void sendResult(String message) throws IOException {
        writer.write(message + "\n\r");
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
