package ch03.그리디;

import java.util.Scanner;

public class 거스름돈_1203 {
    public static void main(String[] args) {
        int[] arr = {500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int a : arr) {
            result += N/a;
            N %= a;
        }

        System.out.println("동전의 개수 : " + result);
    }
}
