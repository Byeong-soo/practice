package level_1;

import java.util.Queue;
import java.util.LinkedList;
public class test7 {

    public int solution(int h, int w, int n, String[] board) {
        int answer = -1;
        int [][] map = new int[h][w];

        for(int i=0;i<board.length;i++){
            String[] split = board[i].split("");
            for(int j=0;j<board.length;j++){
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // ->
       for(int i=0; i<h;i++){
           for(int j=0; j<w;j++){
               if(map[i][j] == 1){
                   queue.add(i);
                   if(queue.size()>4){
                       answer+=1;
                       queue.clear();
                   }
               }
           }
       }





        return answer;
    }
}
