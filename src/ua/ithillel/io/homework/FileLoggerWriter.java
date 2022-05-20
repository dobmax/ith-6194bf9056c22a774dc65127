package ua.ithillel.io.homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

class FileLoggerWriter {

    private final FileLoggerConfiguration configuration;

    FileLoggerWriter(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    void write(String message) {
        if ((configuration.getFile().length() + message.length()) > configuration.getMaxSize()) {
            throw new FileMaxSizeReachedException("SWW");
        }

        try (FileOutputStream fout = new FileOutputStream(configuration.getFile());
             BufferedOutputStream bout = new BufferedOutputStream(fout)) {
            bout.write(
                    String.format(
                                    configuration.getPattern(),
                                    new Date(),
                                    configuration.getLevel(),
                                    message
                            )
                            .getBytes()
            );
            bout.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
