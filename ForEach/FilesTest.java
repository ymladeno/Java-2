package ForEach;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);
    }
}
