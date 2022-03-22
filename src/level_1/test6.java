package level_1;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

public class test6 {

    public int solution(String p, String s) {
        int answer = -1;

        if(!s.equals(p)){
            answer = 0;
            String[] ArrSpringP = p.split("");
            int[] ArrIntegerP = Stream.of(ArrSpringP).mapToInt(Integer::parseInt).toArray();
            String[] ArrSpringS = s.split("");
            int[] ArrIntegerS = Stream.of(ArrSpringS).mapToInt(Integer::parseInt).toArray();


            for(int i=0;i<ArrIntegerP.length;i++){
                int num = Math.abs(ArrIntegerP[i] - ArrIntegerS[i]);
                if(num <=5){
                    answer+=num;
                    System.out.println("num = " + num);
                    System.out.println("answer = " + answer);
                }
                if(num >5){
                    answer=10-num;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
