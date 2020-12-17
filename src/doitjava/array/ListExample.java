package doitjava.array;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> week = new ArrayList<>();
        week.add("월");
        week.add("화");
        week.add("수");
        week.add("목");
        week.add("금");
        week.add("토");
        week.add("일");
        for(int i = 0 ; i < week.size() ; ++i){
            System.out.println(i + " : " + week.get(i));
        }

        if(week.contains("월")){
            System.out.println("월요일을 포함하고 있습니다!");
        }
    }
}
