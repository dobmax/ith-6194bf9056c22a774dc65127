package ua.ithillel.io.homework;

import java.io.File;

public class FileLoggerConfiguration {
    private File file;
    private LoggingLevel level;
    private int maxSize;
    private final String pattern = "[%s][%s] Message: %s";

    public FileLoggerConfiguration(File file, LoggingLevel level, int size) {
        this.file = file;
        this.level = level;
        this.maxSize = size;
    }

    public File getFile() {
        return file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getPattern() {
        return pattern;
    }
}
