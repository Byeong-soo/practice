import java.util.Arrays;
import java.util.stream.IntStream;

public class practice13 {

    public int solution(int[] numbers) {
        int answer = -1;
        int totalNum = 0;
        int dupTotalNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <10; j++) {
                if (numbers[i] == j) {
                dupTotalNum = dupTotalNum+numbers[i];
                }
            }
            totalNum = totalNum + i;
        }
        answer = totalNum-dupTotalNum;
        return answer;
    }

    public static void main(String[] args) {

    }
}
