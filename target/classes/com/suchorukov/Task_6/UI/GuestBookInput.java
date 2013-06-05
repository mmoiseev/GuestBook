package com.suchorukov.Task_6.UI;

import java.io.Closeable;

public interface GuestBookInput extends Closeable {
    public abstract String getCommand();
}
