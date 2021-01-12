package doitjava.modern.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamEx {
    public static void main(String[] args) {
        /* filter */
        List<Dish> vegetarianMenu = Dish.menu.stream().filter(Dish::isVegetarian).collect(toList());
        System.out.println("vegetarianMenu = " + vegetarianMenu);

        /* takeWhile, dropWhile */
        List<Dish> lightMenu = Dish.menu.stream().sorted(comparing(Dish::getCalories)).takeWhile(dish -> dish.getCalories() < 320).collect(toList());
        System.out.println("lightMenu = " + lightMenu);
        List<Dish> heavyMenu = Dish.menu.stream().sorted(comparing(Dish::getCalories)).dropWhile(dish -> dish.getCalories() < 320).collect(toList());
        System.out.println("heavyMenu = " + heavyMenu);

        /* limit, skip */
        List<Dish> TopLight3Menu = Dish.menu.stream().sorted(comparing(Dish::getCalories)).limit(3).collect(toList());
        System.out.println("TopLight3Menu = " + TopLight3Menu);
        List<Dish> TopHeavy3Menu = Dish.menu.stream().sorted(comparing(Dish::getCalories)).skip(3).collect(toList());
        System.out.println("TopHeavy3Menu = " + TopHeavy3Menu);

        /* Quiz 5-1 */
        List<Dish> twoMeats = Dish.menu.stream().filter(dish -> dish.getType() == Dish.Type.MEAT).limit(2).collect(toList());
        System.out.println("twoMeats = " + twoMeats);

        /* map, flatMap */
        List<String> dishNames = Dish.menu.stream().map(Dish::getName).collect(toList());
        System.out.println("dishNames = " + dishNames);
        List<String> dishNamesUniqueCharacters = dishNames.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println("dishNamesUniqueCharacters = " + dishNamesUniqueCharacters);

        /* Quiz 5-2 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(toList());
        System.out.println("squares = " + squares);
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<List<Integer>> pairs = list1.stream()
                .flatMap(i -> list2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> Arrays.asList(i, j)))
                .collect(toList());
        System.out.println("pairs = " + pairs);

        /* findAny */
        Dish.menu.stream()
                .filter(dish -> dish.getCalories() < 300)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        /* reduce & Quiz 5-3 */
        int count1 = Dish.menu.stream()
                .map(dish -> 1)
                .reduce(0, Integer::sum);
        System.out.println("count1 = " + count1);
        Long count2 = Dish.menu.stream().count();
        System.out.println("count2 = " + count2);
    }
}
