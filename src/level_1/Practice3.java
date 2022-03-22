package level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice3 {


        public static int[] solution(long n) {
            int[] answer = new int[String.valueOf(n).length()];
            int index = 0;

            int temp = 0;
            while(n>0) {
                temp = (int) (n%10);
                n = n/10;
                answer[index] = temp;
                index ++;
            }
            return answer;
        }



        public static void main(String[] args) {
            int[] answer = solution(12345);
            System.out.println(answer);

            for (int i=0; i<answer.length;i++){
                System.out.print(answer[i]);
            }

    }
}
