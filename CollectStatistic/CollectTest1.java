package CollectStatistic;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest1 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("This", "is", "a", "stream");
        List<String> l = s.collect(Collectors.toList());
        System.out.println(l);

        Stream<String> s1 = Stream.of("This", "is", "a", "stream");
        Collection<String> treeSet = s1.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
    }
}
