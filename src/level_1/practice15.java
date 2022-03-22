package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice15 {

    public int[] solution(int[] arr) {
        int min = arr[0];

        if(arr.length<=1){
            int[] answer = {-1};
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }


        int index = 0;
        int[] answer = new int[arr.length-1];
        for(int i=0; i<arr.length; i++){

            if(arr[i] ==min){
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
