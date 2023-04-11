package IO;

import java.io.IOException;
import java.nio.file.*;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class NioTest {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
            .map(Path::getFileName)
            .map(Path::toString)
            .filter(name -> name.endsWith(".java"))
            .forEach(System.out::println);

        Files.lines(Paths.get("NioTest.java"))
            .forEach(System.out::println);

        System.out.println(
            Files.lines(Paths.get("NioTest.java"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.averagingInt(String::length))
        );

        IntSummaryStatistics stats = Files.lines(Paths.get("NioTest.java"))
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .collect(Collectors.summarizingInt(String::length));

        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
    }    
}
