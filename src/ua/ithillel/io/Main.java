package ua.ithillel.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    /**
     * SOLID
     *
     * S - Single Responsibility. Есть одна причина для существования
     * Класс и\или метод делает только одну вещь.
     *
     * D - Dependency Inversion. Это инверсия зависимостей, где мы работает от абстракции, а не её реализации
     */

    /**
    // Absolute
    // `c:/Program Files/java/jre/java.exe`
    // Relative
    // current working dir is `c:/Program Files`
    // `java/jre/java.exe`
    // `/java/jre/java.exe`
    // `./java/jre/java.exe`
     **/
    public static void main(String[] args) throws Exception {
        doDemo6();
    }

    static void doDemo6() throws Exception {
        System.out.println(Files.createFile(Path.of("text.txt")));
        System.out.println( new File("text.txt").createNewFile());
        System.out.println( new File("text.txt").exists());
    }

    static void doDemo5() throws Exception {
        String root = "/Users/wespe/IdeaProjects/ith-6194bf9056c22a774dc65127";
        String child = root + "/" + "text.txt";

        Path absolutePath = Path.of("Users", "wespe", "IdeaProjects", "ith-6194bf9056c22a774dc65127", "text.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.getFileSystem());

        Path newAbsoultePath = absolutePath.resolve("/hello");
        System.out.println(newAbsoultePath);

    }

    static void doDemo4() throws Exception {
        File text = new File("text.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(text, true))) {
            writer.append(new StringBuilder("Hello, from SB!!!!"));
            writer.newLine();
            writer.append("Hello, from STR!!!");
            writer.newLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(text))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    static void doDemo3() throws Exception {
        File text = new File("text.txt");

        try (BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream(text, true))) {
            bufout.write("Once again, hello world!!!".getBytes());
            bufout.write('\n');
            bufout.flush();
        }

        try (BufferedInputStream bufin = new BufferedInputStream(new FileInputStream(text))) {
            int c;
            while ((c = bufin.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println();
        }
    }

    static void doDemo2() throws Exception {
        File text = new File("text.txt");

        try (FileOutputStream fout = new FileOutputStream(text, true)) {
            fout.write("Once again, hello world!!!".getBytes());
            fout.write('\n');
            fout.flush();
        }

        try (FileInputStream fis = new FileInputStream(text)) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println();
        }
    }

    static void doDemo1() throws Exception {
        try (FileInputStream fis = new FileInputStream("/text.txt")) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println();
        }
    }
}
