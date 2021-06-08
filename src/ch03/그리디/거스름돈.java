package ch03.그리디;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        //p.87

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int[] coin_type = {500, 100, 50, 10};

        for (int coin : coin_type) {
            count += N / coin;
            N %= coin;
        }

        System.out.println(count);


    }
}
