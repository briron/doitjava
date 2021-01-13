package doitjava.modern.stream;

import java.util.stream.Stream;

public class IterateStream {
    public static void main(String[] args) {
        /* iterate 만들기 */
        Stream.iterate(0, n -> n+2)
                .limit(10)
                .forEach(System.out::println);

        /* 프레디케이트 활용 */
        Stream.iterate(0, n -> n < 100, n -> n+2)
                .forEach(System.out::println);
    }
}
