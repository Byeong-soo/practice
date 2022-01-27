import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice27 {

    public static int[] solution(String s) {
        int[] answer = {};
        String[] stringArr;
        Integer count = 0;


        ArrayList<Integer> list = new ArrayList<>();

        stringArr = s.split("");
        String check = stringArr[0];
        for(int i=0;i<stringArr.length;i++){
            if(stringArr[i].equals(check)){
                count++;
                if(i== stringArr.length-1){
                    list.add(count);
                }
                continue;
            }
            if(!stringArr[i].equals(check)){
                list.add(count);
                count = 1;
                if(i== stringArr.length-1){
                    list.add(count);
                }
                check = stringArr[i];
            }

        }

        if(stringArr[0].equals(stringArr[stringArr.length-1])){
            Integer last = list.get(list.size()-1);
            Integer first = list.get(0);


            list.set(list.size()-1,last+first);
            list.remove(0);
        }

        answer = list.stream().mapToInt(i->i).sorted().toArray();
        return answer;
    }

    public static void main(String[] args) {
        solution("wowwow");
    }
}
