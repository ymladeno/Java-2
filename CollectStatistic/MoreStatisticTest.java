package CollectStatistic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class MoreStatisticTest {
    public static void main(String[] args) throws IOException {
        IntSummaryStatistics stat = Files.lines(Paths.get("MoreStatisticTest.java"))
                                        .map(String::trim)
                                        .filter(line -> !line.isEmpty())
                                        .collect(Collectors.summarizingInt(String::length));

        System.out.println("Lines: " + stat.getCount());
        System.out.println("Line length avarage: " + stat.getAverage());
        System.out.println("Line length max: " + stat.getMax());
        System.out.println("Line length min: " + stat.getMin());

        System.out.println(" ==================== ");
        System.out.println(stat);
    }
}
