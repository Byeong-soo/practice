import java.util.ArrayList;

public class practice24 {

    public int[] solution(int[] numbers) {

        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                    list.add(numbers[i]+numbers[j]);
                }

            }
        }

        Integer[] test = list.stream().distinct().sorted().toArray(Integer[]::new);
        int[] answer = new int[test.length];
        for(int i=0;i<test.length;i++){
            answer[i] = test[i];
        }

        return answer;
    }
}
