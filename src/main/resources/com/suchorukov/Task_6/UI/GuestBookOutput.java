package com.suchorukov.Task_6.UI;

import java.io.Closeable;
import java.io.IOException;

public interface GuestBookOutput extends Closeable {
    public abstract void sendResult(String message) throws IOException;
}
