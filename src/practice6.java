import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class practice6 {

    public static String[] solution() {

        String[] answer = {};
        int totalTicket = 2000;

        String[] log = {
                "woni request 09:12:29",
                "brown request 09:23:11",
                "brown leave 09:23:44",
                "jason request 09:33:51",
                "jun request 09:33:56",
                "cu request 09:34:02"};
        String[] id = new String[log.length];
        String[] temp = {};
        String[] action =  new String[log.length];
        String[] time =  new String[log.length];
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");


        for(int i=0; i<log.length; i++){
            temp = log[i].split(" ");
            id[i] = temp[0];
            action[i] = temp[1];
            time[i] = temp[2];
        }

        for(int i=0; i< log.length;i++){
            System.out.println("id :" + id[i]);
            System.out.println("action :" + action[i]);
            System.out.println("time :" + time[i]);

            long diff = Timestamp.valueOf(time[i+1]).getTime()-Timestamp.valueOf(time[i]).getTime();
            System.out.println(diff);


        }



        return  answer;
    }


    public static void main(String[] args) {
        solution();

    }



}
