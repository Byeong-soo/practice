public class practice35 {
    /*
    * 문자열 s의 길이가 4 혹은 6이고,
    * 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    * */

    public static boolean solution(String s) {
        boolean answer = true;

        String[] split = s.split("");

        if(split.length!=4 && split.length!=6){
            answer = false;
            return answer;
        }

        for(String one : split){
            System.out.println("one = " + one);
            char c = one.charAt(0);
            if ((int) c < 48 || (int) c > 57) {
                answer = false;
                break;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("00000");
    }

}
