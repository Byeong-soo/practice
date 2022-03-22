package level_1;

public class practice20 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        int standard = price;
        int sum=0;

        for(int i=1; i<=count; i++){
            sum += i*price;
            price = standard*(i+1);
        }
        answer = sum-money;

        return answer;
    }

    public static void main(String[] args) {
       long a = solution(3,20,4);
        System.out.println(a);
    }
}
