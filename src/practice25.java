import java.util.ArrayList;
import java.util.Arrays;

public class practice25 {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            int count = list.size();
            if(arr[i] != list.get(count-1)){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
