package PeekLimitSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("../"))
            .map(Path::getFileName)
            .map(Path::toString)
            .filter(name -> name.endsWith(".java"))
            .limit(2)
            .sorted()
            .forEach(System.out::println);
    }
}
