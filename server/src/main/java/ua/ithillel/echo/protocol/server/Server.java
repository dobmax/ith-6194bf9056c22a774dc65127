package ua.ithillel.echo.protocol.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ECHO Protocol
 */
public class Server {

    private static final Logger log = LogManager.getLogger(Server.class);

    // localhost
    // 127.0.0.1
    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            log.info("Server is starting up ...");
            log.debug("Server: {}", serverSocket);

            log.info("Server is waiting for a connection...");
            try (Socket client = serverSocket.accept();
                 DataInputStream in = new DataInputStream(client.getInputStream());
                 DataOutputStream out = new DataOutputStream(client.getOutputStream())) {
                log.info("Client successfully connected: {}", client);

                while (true) out.writeUTF("Echo: " + in.readUTF());
            }
        } catch (IOException e) {
            throw new RuntimeException("SWW while server processing...", e);
        }
    }


}
