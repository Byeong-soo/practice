package level_1;

import java.util.Locale;

public class practice30 {
//    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
//    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.


       static boolean solution(String s) {
            boolean answer = true;

            s = s.toLowerCase();

            long a,b = 0;

            a = s.chars().filter(c -> c == 'p').count();
            b = s.chars().filter(c -> c == 'y').count();

            if(a != b){
                answer = false;
            }

            return answer;
        }

    public static void main(String[] args) {
        boolean answer = solution("pyy");
        System.out.println("answer = " + answer);
    }

}
