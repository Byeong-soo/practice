package level_1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class practice28 {

    public static String solution1(int a, int b) {
        String answer = "";

        if (a < 1 || a > 12) {
            return "달은 1월부터 12월까지 있습니다.";
        }

        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        answer = dayOfWeek.toString().substring(0,3);

        return answer;
    }

    public static  String solution(int a, int b){
        String answer = "";

        if (a < 1 || a > 12) {
            return "달은 1월부터 12월까지 있습니다.";
        }

        Calendar calendar =  Calendar.getInstance();
        calendar.set(2016,a-1,b);

        Date date = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE", Locale.KOREA);
        answer = sdf.format(date).toUpperCase();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
}
