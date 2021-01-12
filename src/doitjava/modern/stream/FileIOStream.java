package doitjava.modern.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileIOStream {
    public static void main(String[] args) {
        long uniqueWords = 0;
        try(Stream<String> lines = Files.lines(Paths.get("/Users/brody/code/doitjava/src/doitjava/modern/stream/Dish.java"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
            System.out.println("uniqueWords = " + uniqueWords);
        } catch(IOException e) {
            System.out.println("파일 IO 에러");
        }
    }
}
