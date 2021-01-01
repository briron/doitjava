package doitjava.modern.behavior;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple){
        return apple.getColor() == Color.GREEN;
    }
}
