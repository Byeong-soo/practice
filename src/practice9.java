import java.awt.*;

public class practice9 {

    public static String solution(int[] numbers, String hand) {

        String answer = "";
        int rightHandPosition = 0;
        int leftHandPosition = 0;


        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                    answer = answer + "L";
                    leftHandPosition = 3;
                    break;
                case 4:
                    answer = answer + "L";
                    leftHandPosition = 2;
                    break;
                case 7:
                    answer = answer + "L";
                    leftHandPosition = 1;
                    break;
                case 3:
                    answer = answer + "R";
                    rightHandPosition = 3;
                    break;
                case 6:
                    answer = answer + "R";
                    rightHandPosition = 2;
                    break;
                case 9:
                    answer = answer + "R";
                    rightHandPosition = 1;
                    break;

            }// switch
            int right = rightHandPosition;
            int left = leftHandPosition;

            if (numbers[i] == 2) {
                if (right - 3 > left - 3) {
                    answer = answer + "L";
                    leftHandPosition = 3;
                } else if(right - 3 < left - 3){
                    answer = answer + "R";
                    rightHandPosition =3;
                } else {
                    if(hand.equals("right")){
                        answer = answer +"R";
                        rightHandPosition = 3;
                    } else{
                        answer = answer + "L";
                        leftHandPosition = 3;
                    }
                }

            } else if (numbers[i] == 5) {
                if (right - 2 > left - 2) {
                    answer = answer + "L";
                    leftHandPosition = 2;
                } else if(right - 2 < left - 2){
                    answer = answer + "R";
                    rightHandPosition = 2;
                } else {
                    if(hand.equals("right")){
                        answer = answer +"R";
                        rightHandPosition = 2;
                    } else{
                        answer = answer + "L";
                        leftHandPosition = 2;
                    }
                }

            } else if (numbers[i] == 8) {
                if (right - 1 > left - 1) {
                    answer = answer + "L";
                    leftHandPosition = 1;
                } else if(right - 1 < left - 1){
                    answer = answer + "R";
                    rightHandPosition = 1;
                } else {
                    if(hand.equals("right")){
                        answer = answer +"R";
                        rightHandPosition = 1;
                    } else{
                        answer = answer + "L";
                        leftHandPosition = 1;
                    }
                }

            }

        } // for

        return answer;

    }


    public static void main(String[] args) {
       int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
     solution(num, "right");
        System.out.println( solution(num, "right"));

    }
}
