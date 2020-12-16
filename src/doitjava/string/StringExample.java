package doitjava.string;

public class StringExample {
    public static void main(String[] args) {
        String a = "Hello";

        // equals
        System.out.println(a.equals("Hello"));

        // indexOf
        System.out.println(a.indexOf("o"));

        // replace
        System.out.println(a.replace("ll","ooo"));
        System.out.println(a);

        // substring
        System.out.println(a.substring(1));
        System.out.println(a.substring(2,3)); // 파이썬의 인덱싱과 유사
        try {
            System.out.println(a.substring(2,10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("index out of range");
        }

        // toUpperCase
        System.out.println(a.toUpperCase());


    }
}
