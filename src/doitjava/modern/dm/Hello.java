package doitjava.modern.dm;

public interface Hello {
    void print();
    default void defaultPrint(){
        System.out.println("Hello");
    }
}
