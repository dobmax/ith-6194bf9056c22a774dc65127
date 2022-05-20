package ua.ithillel.io.homework;

/**
 * Таблица видимости:
 * | LEVEL  | INFO | DEBUG | TRACE |
 * | INFO	|   X  |       |       |
 * | DEBUG  |   X  |   X   |       |
 * | TRACE  |   X  |   X   |   X   |
 */
public class FileLogger {

    private final FileLoggerWriter writer;
    private final FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        this.writer = new FileLoggerWriter(configuration);
    }

    public void info(String message) {
        if (LoggingLevel.INFO.ordering() > configuration.getLevel().ordering()) return;
        this.writer.write(message);
    }

    public void debug(String message) {
        if (LoggingLevel.DEBUG.ordering() > configuration.getLevel().ordering()) return;
        this.writer.write(message);
    }

}
