import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practice1 {

    public static int[] solution(int money) {

        int[] answer = new int[9];
        int[] sort_money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50 ,10 ,1};

        for(int i=0; i<answer.length; i++){
            answer[i] = money/sort_money[i];
            money = money%sort_money[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int money = random.nextInt(1000000) + 1;

        int[] result = solution(money);

        System.out.println("money \t result");
        System.out.print(money);
        System.out.print("\t[");
        for (int i=0; i<result.length; i++){
            if(i==8){
                System.out.print(result[i]);
                continue;
            }
            System.out.print(result[i] + ",");
        }
        System.out.print("]");
    }
}
