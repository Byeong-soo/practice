package level_1;

import java.util.Arrays;
import java.util.Comparator;

public class practice19 {
    public static long solution(long n) {
        long answer = 0;

        String num = String.valueOf(n);
        String[] numArr = num.split("");

       numArr = Arrays.stream(numArr).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        num="";
       for(int i=0;i< numArr.length;i++){
           num = num + numArr[i];
       }
       answer =Long.parseLong(num);


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(41233));
    }
}
