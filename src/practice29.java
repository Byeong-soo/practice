public class practice29 {

    // 두사이 정수의 합 리턴


        public static long solution(int a, int b) {
            long answer = 0;

            if(a!=b){
                for(int i= Integer.min(a,b); i<=Integer.max(a,b);i++){
                    answer += i;
                }
            }else {
                answer = a;
            }
            return answer;
        }


    public static void main(String[] args) {
        System.out.println(solution(3,3));
    }
}
