package boj.bronze2;

import java.util.Scanner;

public class 단어의개수1152_1210 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        int count = 0;

        for (String w : words) {
            if (w.equals("")) continue;
            count++;
        }

        System.out.println(count);

    }
}
