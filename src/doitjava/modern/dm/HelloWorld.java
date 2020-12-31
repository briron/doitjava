package doitjava.modern.dm;

public class HelloWorld implements Hello {
    @Override
    public void print() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
        helloWorld.defaultPrint(); // 디폴트 메서드는 인터페이스에서 구현되어 있다.
    }

}
