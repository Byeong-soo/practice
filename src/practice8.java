public class practice8 {



    public static void main(String[] args) {
        String s = "123fourfive";
        int answer = 0;

        String[] num = {"1","2","3","4","5","6","7","8","9","0"};
        String[] sNum = {"one","two","three","four","five","six","seven","eight","nine","zero"};

        for(int i=0;i<sNum.length;i++){
           s= s.replace(sNum[i],num[i]);
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
