package level_1;

public class practice16 {

//    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    public static double solution(int n, int m) {

        long answer = 0;
        int x=1;
        double result = Math.sqrt(n);

        if(result%1 ==0){
           answer = Math.round((result+1)*(result+1));
        }else{
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println( solution(12,122));
    }
}
