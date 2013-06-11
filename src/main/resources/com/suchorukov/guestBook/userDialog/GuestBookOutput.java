package com.suchorukov.guestBook.userDialog;

import java.io.Closeable;
import java.io.IOException;

public interface GuestBookOutput extends Closeable {
    public abstract void sendResult(String message) throws IOException;
}
