package ua.ithillel.chat.application.server;

import java.io.OutputStream;

public interface BroadcastMessenger {
    void doBroadcast(String message, Iterable<OutputStream> streams);
}
