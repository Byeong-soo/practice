import javax.xml.stream.util.StreamReaderDelegate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice34 {

    public static String solution(String s) {
        String answer = "";

        char[]  chs = s.toCharArray();
        ArrayList<Integer> intList = new ArrayList<>();

        for(Character ch : chs){
            int num = ch;
            intList.add(num);
        }

        Object[] objects = intList.stream().sorted(Comparator.reverseOrder()).toArray();
        StringBuilder sb = new StringBuilder();

        for(Object one : objects){
            int num = Integer.parseInt(one.toString());
            sb.append((char)num);
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
    solution("ZakKbdx");
    }
}
