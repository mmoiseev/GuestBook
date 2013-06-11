package com.suchorukov.guestBook.userDialog;

import java.io.Closeable;

public interface GuestBookInput extends Closeable {
    public abstract String getCommand();
}
