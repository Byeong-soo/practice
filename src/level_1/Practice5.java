package level_1;

public class Practice5 {

    public static int solution(int num){
        int temp = 0;
        int count = 0;
        int a = 0;

        for(int i=1; i<=num; i++){
            a = i;
            while(a>1){
                temp = a%10;
                a = a/10;
                if(temp == 3 || temp == 6 || temp ==9){
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(13));

    }
}
