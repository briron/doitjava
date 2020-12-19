package doitjava.console;

import java.util.Scanner;

public class ConsoleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text);
    }
}
