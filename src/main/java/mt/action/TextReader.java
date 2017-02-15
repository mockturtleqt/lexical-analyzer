package mt.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TextReader {
    private static final Logger logger = LogManager.getLogger();

    public String readTextFromFile(String filepath) {
        String content = null;
        try {
            content = Files.lines(Paths.get(filepath)).collect(Collectors.joining());
        } catch (NoSuchFileException e) {
            logger.fatal(e);
            throw new RuntimeException();
        } catch (IOException e) {
            logger.error(e);
        }
        return content;
    }
}
