package CollectStatistic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SummaryStatistic {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.lines(Paths.get("SummaryStatistic.java"))
                                        .map(String::trim)
                                        .filter(line -> !line.isEmpty())
                                        .mapToInt(String::length)
                                        .summaryStatistics());
    }
}
