package baekjoon.level7;

import java.util.Scanner;

public class case7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mount = sc.nextInt();
        int mount2 = 0;

        int count3kg = 0;
        int count5kg = 0;

        int index = mount/5;

        for (int i = index; i >= 0; i--) {
            mount2 = mount;
            mount2 = mount2 - 5*i;

            if(mount2%3 == 0){
                System.out.println(i+mount2/3);
                return;
            }
        }
        System.out.println(-1);
    }
}

