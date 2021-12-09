package ch04;

import java.util.Scanner;

public class 시각_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String temp = i +""+ j +""+ k;
                    if (temp.contains("3")) count++;
                }
            }
        }
        System.out.println(count);
    }
}
