package doitjava.modern.thread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello World!");
        });
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
