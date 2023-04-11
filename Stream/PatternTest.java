package Stream;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[, ]+");
        p.splitAsStream("a, b,  c").forEach(System.out::println);
    }
}
