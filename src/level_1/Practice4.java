package level_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice4 {

    public static int checkNum(int[]ints) {
        int result = 0;

        if(ints[1] != ints[0]+1){
            result = -1;
        }
        if(ints[1]%2 !=0 || ints[0]%2 !=1){
            result = -1;
        }
        return result;
    }

    public static int cal(int[]ints){
            int calResult = 0;

        for(int i=0;i< ints.length;i++){
            int num = ints[i];
            int sum = 0;
            int mal = 1;

            int temp = 0;
            int tempResult = 0;

           while (num>0){
               temp = (int)(num%10);
               num = num/10;

               sum = sum + temp;
               mal = mal * temp;

           }
            if(sum > mal){
                tempResult = sum;
            } else{
                tempResult = mal;
            }

                if(calResult < tempResult){
                    calResult = tempResult;
                }
        }

        return calResult;
    }

    public static int solution(Map<String,int[]> ints) {
        int result = -3;


        int[] pobiArray = ints.get("pobi");
        int[] crongArray = ints.get("crong");

        int pobi = cal(pobiArray);
        int crong = cal(crongArray);

        if(checkNum(pobiArray) == -1 || checkNum(crongArray) == -1){
            result = -1;
            return result;
        }

        if(pobi > crong) {
            result = 1;
            return result;
        }

        if(pobi < crong) {
            result = 2;
            return result;
        }

        if(pobi == crong) {
            result = 0;
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, int[]>map = new HashMap<>();
        map.put("pobi", new int[]{23, 24});
        map.put("crong", new int[]{25, 26});

        System.out.println(solution(map));


    }
}
