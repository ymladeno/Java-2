package CollectStatistic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningTest {
    public static void main(String[] args) {
        String strs[] = new String[] {"This", "is", "joining", "in", "Java"};
        List<String> l = Arrays.asList(strs);
        
        String s = l.stream().collect(Collectors.joining(" "));
        System.out.println(s);
    }
}
