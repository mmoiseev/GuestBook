package com.suchorukov.Task_6;

import com.suchorukov.Task_6.UI.*;

import java.io.IOException;

public class GuestBookUIController {
    private GuestBookInput input;
    private GuestBookOutput output;

    public GuestBookUIController(GuestBookInput input, GuestBookOutput output) throws IOException {
        this.input = input;
        this.output = output;

        if (input == null || output == null)
            throw new IllegalArgumentException("Не передан один потоков ввода/вывода!");

        dialog();

    }

    private void dialog() throws IOException {
        String userCommand;
        while(true){
            userCommand = input.getCommand();
            userCommand = userCommand.toLowerCase();
            if (!userCommand.isEmpty()){
                if ("exit".equals(userCommand)) break;
            } else {
                output.sendResult("Введите команду!");
            }

        }
    }


}
