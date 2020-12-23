package doitjava.enumtype;

public class EnumExample {
    public static void main(String[] args) {
        Week today = Week.WEDNESDAY;
        System.out.println(today.name());
        System.out.println(today.ordinal());
        System.out.println(today.compareTo(Week.WEDNESDAY));
    }
}
