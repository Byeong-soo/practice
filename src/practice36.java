import java.util.ArrayList;

public class practice36 {
    /*
    * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
    *
    * */


    public static int solution(int n) {
        int answer = 0;

        for (int j = 2; j <= n; j++) {
            int check = 0;

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    break;
                } else {
                    check += 1;
                }
            }

            if (check == j - 2) {
                answer += 1;
            }

        }
        return answer;
    }


    //============================================================

    //소수인지 체크

        public static boolean check ( int n){
            boolean check = false;

            //짝수면 소수아님. 바로 리턴
            if (n % 2 == 0) {
                return check;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }


            }

            return check;
        }


        public static ArrayList<Integer> nIsDecimal (int n, ArrayList<Integer> multiple){
            boolean check = true;
            double root = Math.sqrt(n);
            int num = (int) root;

            for(Integer oneMultiple : multiple){
                if(oneMultiple > num){
                    break;
                }
                if(n % oneMultiple ==0){
                    check = false;
                    break;
                }
            }
            if(check){
                multiple.add(n);
            }
            return multiple;
        }

        public static int solution1 ( int n){
            ArrayList<Integer> multiple = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                nIsDecimal(i, multiple);
            }
            return multiple.size();
        }

        public static void main (String[]args){
            int i = solution1( 3);
            System.out.println("i = " + i);
        }

    }
