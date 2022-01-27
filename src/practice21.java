import java.util.Arrays;

public class practice21 {
    public static int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;

        for(int i=0; i< 10;i++){
           for(int j=0; j<numbers.length;j++){
               if(i==numbers[j]){
                   sum += numbers[j];
               }
           }
        }


        answer = 55-sum;
        return answer;
    }

    public static void main(String[] args) {
      int sum =  solution(new int[]{5,8,4,0,6,7,9});
        System.out.println(sum);
    }
}
