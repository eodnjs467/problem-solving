package ch03.그리디;

import java.util.Scanner;

public class 숫자1이될때까지_Answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            int target = (n / k) * k;
            result += (n - target);
            n = target;

            if (n<k) break;
            result += 1;
            n /= k;

            result += (n - 1);
            System.out.println(result);

            // ㄷㄷ.. 수학식을 만들어서 푸는걸 습관화 해야하나 ... 너무 구현쪽으로만 접근한 것 같당 ...
        }
    }
}
