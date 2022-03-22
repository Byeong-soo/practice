package level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice26 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Map<String,String> one = new HashMap<>();
        Map<String,String> full = new HashMap<>();
        Map<String,String> dup = new HashMap<>();
        Map<String,String> index = new HashMap<>();


        for(int i=0; i<strings.length; i++){
            full.put(String.valueOf(i),strings[i]);
             String temp = strings[i].substring(n,n);
            one.put(String.valueOf(i),temp);

        }

        String[] oneArr = new String[one.size()];
        for(int i=0; i<one.size(); i++){
            oneArr[i] = one.get(String.valueOf(i));

        }

       String[] orderOne = Arrays.stream(oneArr).sorted().toArray(String[]::new);


        for(int i=0; i<orderOne.length;i++){
            for(int j=i+1; j< orderOne.length;j++){
                if(orderOne[i] == orderOne[j]){
                    dup.put(String.valueOf(i),orderOne[i]);
                }
            }
        }

        // value로 key 찾기
        Set<Map.Entry<String, String>> entrySet = one.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            if (entry.getValue().equals("Apple")) {
                System.out.println(entry.getKey()); // 1, 3
            }
        }




        for(int i=0; i< orderOne.length; i++){

        }

        return answer;
    }
}
