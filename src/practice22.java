public class practice22 {

    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 ==0){
            //짝수일때
            String[] sArr = s.split("");
            answer = sArr[(sArr.length/2-1)];
            answer += sArr[(sArr.length)/2];

        }else{
            // 홀수일때
           String[] sArr = s.split("");
            answer = sArr[(sArr.length-1)/2];

        }
        return answer;
    }
}
