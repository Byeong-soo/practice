public class practice14 {

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int a = 0;


        while (n>1){
          a=n%10;
          n=n/10;

          sum = sum+a;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
