package ua.ithillel.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        oiDemo2();
    }

    static void oiDemo2() throws Exception {
        byte[] helloWorld = "Привет, world!".getBytes(StandardCharsets.UTF_8);
        byte[] message;

        try (ByteArrayOutputStream barrout = new ByteArrayOutputStream();
             BufferedOutputStream bout = new BufferedOutputStream(barrout)) {
            bout.write(helloWorld);
            bout.write('!');
            bout.write('!');
            bout.write('\n');
            bout.flush();
            message = barrout.toByteArray();
        }

        try (BufferedInputStream bin = new BufferedInputStream(new ByteArrayInputStream(message))) {
            int c;
            while ((c = bin.read()) != -1) {
                System.out.print((char) c);
            }
        }

    }

    static void oiDemo1() throws Exception {
        byte[] helloWorld = "Привет, world!".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(helloWorld));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(helloWorld);
        out.write('!');
        out.write('!');
        out.write('\n');
        byte[] message = out.toByteArray();

        ByteArrayInputStream in = new ByteArrayInputStream(message);
        int c;
        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }
        System.out.println();
    }
}
