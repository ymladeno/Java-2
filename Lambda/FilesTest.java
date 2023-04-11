package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("Hello.java"))
            .map(String::trim)
            .forEach(System.out::println);
    }
}
