package level_1;

public class practice7 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        int minRank = 0;
        int maxRank = 0;


        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                zeroCount++;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        switch (count) {
            case 0:
                minRank = 6;
                break;
            case 1:
                minRank = 6;
                break;
            case 2:
                minRank = 5;
                break;
            case 3:
                minRank = 4;
                break;
            case 4:
                minRank = 3;
                break;
            case 5:
                minRank = 2;
                break;
            case 6:
                minRank = 1;
                break;
        }

        if(zeroCount !=6){
            maxRank = minRank-zeroCount;
        } else{
            maxRank = 1;
        }



        answer[1] = minRank;
        answer[0] = maxRank;


        return answer;
    }
}
