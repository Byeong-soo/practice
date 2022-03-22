package level_1;

import java.util.Arrays;

public class practice17 {

    public long solution(long n) {
        long answer = 0;
        String sn = Long.toString(n);
        String[] snarr = sn.split("");
         Arrays.sort(snarr);
        String temp ="";

        for(int i=0;i<snarr.length;i++){
            temp = temp+snarr[i];
        }
        answer = Integer.parseInt(temp);
        return answer;
    }

    public static void main(String[] args) {

    }
}
