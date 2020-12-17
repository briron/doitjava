package doitjava.string;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());
        System.out.println(sb.substring(1, 2).getClass().getName());
    }




}
