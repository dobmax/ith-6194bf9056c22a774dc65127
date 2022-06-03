package ua.ithillil.echo.protocol.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final Logger log = LogManager.getLogger(Client.class);

    public Client() {
        log.info("Client is starting up ...");
        try (Socket socket = new Socket("localhost", 8080);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {

            System.out.println("Client successfully connected.");

            new Thread(() -> {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            })
                    .start();

            while (true) System.out.println("Message: " + in.readUTF());
        } catch (IOException e) {
            throw new RuntimeException("SWW while client processing...", e);
        }
    }
}
