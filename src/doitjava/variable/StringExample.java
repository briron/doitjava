package doitjava.variable;

public class StringExample {
    public static void main(String[] args) {
        // 리터럴을 이용하여 선언된 경우
        String c = new String("test");
        String a = "test";
        String b = "test";
        
        if(a == b){
            System.out.println("리터럴로 선언된 경우에는 참조 값이 같다.");
        }
        if(b == c){
            System.out.println("??");
        }
    }
}
