package level_1;

import java.util.*;
import java.util.stream.Stream;


public class practice31 {
    /*
    문제 설명
 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
     */

    static public ArrayList<String> solution(String[] strings, int n) {
        ArrayList<String> answer = new ArrayList<>();


        Map<String,ArrayList<String>> charMap = new HashMap<>();

        for(String s : strings){
            String[] split = s.split("");
            if(!charMap.containsKey(split[n])){
                charMap.put(split[n],new ArrayList<>());
            }
            ArrayList<String> wordsList = charMap.get(split[n]);
            wordsList.add(s);
            Collections.sort(wordsList);

        }


        Object[] objects = charMap.keySet().toArray();
        Object[] objects1 = Arrays.stream(objects).sorted().toArray();


        for(int i=0;i<objects1.length;i++){
            Object[] objects2 = charMap.get(objects1[i]).toArray();

            for(Object object : objects2){
                answer.add(object.toString());
            }
        }

        return answer;
    }



    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car", "bear"};
        solution(strings, 1);

    }
}
