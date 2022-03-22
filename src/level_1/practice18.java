package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class practice18 {

    public static String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();



        String[] new_id_arr = new_id.split("");
        StringBuilder new_idBuilder = new StringBuilder();
        for(int i = 0; i<new_id_arr.length; i++){
           char one = new_id_arr[i].charAt(0);
            if( ((int)one>=97 && (int)one<=122) ||(int)one== 45||(int)one== 46||(int)one== 95 ||((int)one >= 48 && (int)one<=57)){
                new_idBuilder.append(one);
            }
        }
        new_id = new_idBuilder.toString();
        new_id_arr = new_id.split("");
        new_idBuilder.setLength(0);
        for(int i = 0; i<new_id_arr.length; i++){
            if(i==new_id_arr.length-1){
                new_idBuilder.append(new_id_arr[i]);
                continue;
            }
            if(!(new_id_arr[i].equals(".") && new_id_arr[i].equals(new_id_arr[i+1]))){
                new_idBuilder.append(new_id_arr[i]);
            }
        }
        new_id = new_idBuilder.toString();

        if(new_id.startsWith(".")){
            if(new_id.length()<=1){
                new_id="";
            }else{
                new_id=new_id.substring(2,new_id.length()-1);
            }


        }

        if(new_id.endsWith(".")){
            if(new_id.length()<=1){
                new_id="";
            }else{
                new_id=new_id.substring(0,new_id.length()-1);
            }

        }

        if(new_id.length()==0){
            new_id ="a";
        }

        if(new_id.length()>=16){
           new_id = new_id.substring(0,15);
          if(new_id.endsWith(".")){
              new_id=new_id.substring(0,new_id.length()-1);
          }
        }

        if(new_id.length()<=2){
            StringBuilder new_idBuilder1 = new StringBuilder(new_id);
            while (new_idBuilder1.length()<3){
                String plus = new_idBuilder1.substring(new_idBuilder1.length()-1);
                new_idBuilder1.append(plus);
            }
            new_id = new_idBuilder1.toString();
        }


        answer = new_id;
        return answer;
    }

    public static void main(String[] args) {
        String a = "1234";
        String b = "1234";
        String c = "1234";
        String d = "1234";
        String e = "1234";
        System.out.println(a.length());
        b=b.substring(1,3);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);



    }
}
