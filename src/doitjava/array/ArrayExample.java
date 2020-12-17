package doitjava.array;

public class ArrayExample {
    public static void main(String[] args) {
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        for(int i = 0 ; i < week.length ; ++i) {
            System.out.print(week[i] + " ");
        }

        int[] odd = new int[5];
        for(int i = 0 ; i < odd.length ; ++i){
            System.out.print(odd[i] + " ");
            odd[i] = 2 * i + 1;
            System.out.println(odd[i]);
        }

        try {
            System.out.println(odd[6]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bounds Exception");
        }
    }
}
