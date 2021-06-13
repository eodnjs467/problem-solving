package ch04;

import java.util.Scanner;

public class 시각 {
    public static void main(String[] args) {
        //p.113

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =0;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                    if (time.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
