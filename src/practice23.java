import java.util.ArrayList;
import java.util.List;

public class practice23 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
               list.add(arr[i]);
            }

        }
        if(list.size()<1){
            list.add(-1);
        }

            answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
