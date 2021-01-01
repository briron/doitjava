package doitjava.modern.behavior;

import java.util.ArrayList;
import java.util.List;

public class AppleFarm {
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor() == Color.GREEN){
                result.add(apple);
            }
        }
        return result;
    }
}
