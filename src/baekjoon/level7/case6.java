package baekjoon.level7;

import java.util.*;

public class case6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();

        for (int i = 0; i < caseCount; i++) {

            int h = sc.nextInt();
            int w = sc.nextInt();
            int num = 0;


            int[] people = new int[w];
            int[] people1 = new int[w];

            for (int a = 0; a < w; a++) {
                num = a+1;
                people[a] = num;
            }

            for(int j=0; j<h;j++){
                num = 0;
                for (int e = 0; e < w; e++) {
                    num += people[e];
                    people1[e] = num;
                }
                people = people1;
            }

            System.out.println(people[w-1]);
        }
    }

}