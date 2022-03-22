package level_1;

public class test2 {
    class Solution {
        public String solution(String[] arr) {

            String[] log = {};
            log = arr;
            String answer;
            int resulthour = 0;
            int resultminute = 0;
            for (int i = 0; i < log.length; i++) {
                String[] log1 = log[i].split(":");
                i++;
                String[] log2 = log[i].split(":");
                int hour = Integer.parseInt(log2[0]) - Integer.parseInt(log1[0]);
                int minute = Integer.parseInt(log2[1]) - Integer.parseInt(log1[1]);

                switch (hour) {
                    case 0:
                        if (minute <= 4) {
                            break;
                        } else {
                            resultminute += minute;
                        }
                        break;
                    case 1:
                        if (minute <= 45) {
                            resultminute += 60 + minute;
                        } else {
                            resultminute += 60 + 45;
                        }
                        break;
                    case 2:
                        if (minute < -15) {
                            resultminute += 120 + minute;
                        } else if (minute >= -15) {
                            resultminute += 60 + 45;
                        }
                        break;
                    default:
                        resultminute += 60 + 45;
                        break;
                }
            }
            resulthour = resultminute / 60;
            resultminute = resultminute % 60;
            String shour, sminute;
            if (resulthour < 10) {
                shour = "0" + resulthour;
            } else {
                shour = Integer.toString(resulthour);
            }
            if (resultminute < 10) {
                sminute = "0" + resultminute;
            } else {
                sminute = Integer.toString(resultminute);
            }
            answer = shour + ":" + sminute;

            return answer;
        }
    }
}
