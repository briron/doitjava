package doitjava.modern.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamEx {
    public static void main(String[] args) {
        /* mapToInt sum */
        System.out.println(Dish.menu.stream()
                .mapToInt(Dish::getCalories)
                .sum());

        /* rangeClosed */
        IntStream.rangeClosed(0, 20)
                .forEach(System.out::println);

        /* 피타고라스 */
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(1, 100)
                            .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                            .mapToObj(b -> new int[]{a, b, (int)Math.sqrt(a*a + b*b)})
                );
        pythagoreanTriples.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }
}
