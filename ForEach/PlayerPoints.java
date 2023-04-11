package ForEach;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayerPoints {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Barbara", "X", "Y", "WHY", "Mike");
        Player bestPlayer = names.stream()
                            .map(name -> new Player(name, Player.getScore()))
                            .reduce(new Player("", 0), (p1,p2) -> (p1.scope > p2.scope) ? p1 : p2);

        System.out.println(bestPlayer);
    }

    private static class Player {
        public final String name;
        public final long scope;

        public Player(String name, long scope) {
            this.name = name;
            this.scope = scope;
        }

        public static long getScore() {
            return (long)(Math.random() * 100);
        }

        public String toString() {
            return name + " : " + scope;
        }
    }
}
