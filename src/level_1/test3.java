package level_1;

import java.util.*;

public class test3 {

    public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;

        List<StringBuilder[]> list = new ArrayList<>();
        Map<String, String> ingsMap = new HashMap<>();
        Map<String, Integer> revenueMap = new HashMap<>();

        for (String ing : ings) {
            String[] ingsArr = ing.split(" ");
            ingsMap.put(ingsArr[0], ingsArr[1]);
        }

        for (String s : sell) {
            String[] sellArr = s.split(" ");
            ingsMap.put(sellArr[0], sellArr[1]);
        }

        for (String value : menu) {
            String[] menuArr = value.split(" ");
            String[] sourceArr = menuArr[1].split("");

            int makePrice = 0;

            for (String source : sourceArr) {
                makePrice = makePrice + Integer.parseInt(ingsMap.get(source));
            }
            revenueMap.put(menuArr[0], Integer.parseInt(menuArr[2]) - makePrice);
        }
        for(int i=0; i< sell.length;i++){
            String[] sellArr = sell[i].split(" ");
            answer = answer + revenueMap.get(sellArr[0]) * Integer.parseInt(sellArr[1]);

        }
        return answer;
    }

}
