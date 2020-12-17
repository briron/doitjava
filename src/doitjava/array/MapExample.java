package doitjava.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> scoreboard = new LinkedHashMap<>();
        scoreboard.put("memberA", 100);
        scoreboard.put("memberB", 80);
        scoreboard.put("memberC", 90);
        scoreboard.put("memberD", null);

        System.out.println("memberA의 점수 : " + scoreboard.get("memberA"));

        System.out.println(scoreboard.get("memberD"));
        System.out.println(scoreboard.get("memberE"));

        if(scoreboard.containsValue(100)){
            System.out.println("만점자가 있습니다!");
        }

        for(String member : scoreboard.keySet()){
            System.out.println(member + " : " + scoreboard.get(member));
        }


    }
}
