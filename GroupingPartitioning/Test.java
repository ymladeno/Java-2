package GroupingPartitioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static class Dragon {
        String name;
        Dragon(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public String toString() { return name; }
        public boolean isGreen() { return Math.random() > 0.5; }
    }

    public static List<Dragon> getDragons() {
        return Arrays.asList(new Dragon("Marvi"), new Dragon("Novi"), new Dragon("Muni"), new Dragon("Norgi"));
    }
    public static void main(String[] args) {
        List<Dragon> dragons = getDragons();

        Map<Character, List<Dragon>> groups = dragons.stream().collect(Collectors.groupingBy(dragon -> dragon.getName().charAt(0)));
        System.out.println(groups);

        Map<Boolean, List<Dragon>> groups1 = dragons.stream().collect(Collectors.partitioningBy(dragon -> dragon.isGreen()));
        System.out.println(groups1);
    }
}
