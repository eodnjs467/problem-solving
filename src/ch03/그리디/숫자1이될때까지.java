package ch03.그리디;

import java.util.Scanner;

public class 숫자1이될때까지 {
    public static void main(String[] args) {
        // p.99

        // N, K 를 받고  1.N에서 -1      /2. N/K

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while (true) {
            if (n == 1) break;
            if (n % k == 0) {
                n /= k;
            }else {
                n -= 1;
            }
            count++;

        }

        System.out.println(count);
    }
}
