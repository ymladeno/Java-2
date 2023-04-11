package Lambda;

import java.util.function.Function;
import static java.lang.System.out;

public class FunctionTest {

    static Function<String, String> atr = (name) -> { return "@" + name; };
    static Function<String, Integer> lngt = (name) -> { return name.length(); };
    static Function<String, Integer> lngt1 = String::length;

    public String name() { return "FunctionTest"; }
    public static void main(String[] args) {
        String[] strs = {"Hello", "world", "again"};

        for (String s : strs) out.println(atr.apply(s));
        for (String s : strs) out.println(lngt1.apply(s));

        Function<FunctionTest, String> test = FunctionTest::name;
        out.println(test.apply(new FunctionTest()));
    }
}
