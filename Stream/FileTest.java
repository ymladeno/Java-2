package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.stream.Stream;

public class FileTest {

    public static void writeFile(Writer w, String s) {
        try {
            w.write(s);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try(FileWriter wr = new FileWriter("file")) {
            Stream.of("Hello\n", "there\n", "again\n").forEach(s -> writeFile(wr, s));
        }

        try(FileReader rd = new FileReader("file")) {
            BufferedReader br = new BufferedReader(rd);
            br.lines().forEach(System.out::println);
        }
    }
}
