package CollectStatistic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class AvarageLineTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Avarage line length of this file");
        System.out.println(
            Files.lines(Paths.get("AvarageLineTest.java"))
            .map(String::trim)
            .filter(line -> !line.isEmpty())
            .collect(Collectors.averagingInt(String::length)));
    }
}
