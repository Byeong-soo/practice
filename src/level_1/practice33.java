package level_1;

import java.util.Arrays;

public class practice33 {
    /*
    * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
    * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    * */


    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] words = s.split(" ",-1);

       for(int i=0;i< words.length;i++){
           String[] split = words[i].split("");
           for(int j=0;j<split.length;j++){
               if(j % 2 ==0){
                   split[j] = split[j].toUpperCase();
               }else{
                   split[j] = split[j].toLowerCase();
               }
               answer.append(split[j]);
           }
           if(i< words.length-1){
               answer.append(" ");
           }
       }

        return answer.toString();
    }

    public static void main(String[] args) {
        String word = solution("AAA BBB ccc");
        System.out.println("word = " + word);
    }
}
