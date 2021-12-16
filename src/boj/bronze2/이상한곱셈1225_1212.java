package boj.bronze2;

import java.util.Scanner;

public class 이상한곱셈1225_1212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().split(" ");

        String[] A = temp[0].split("");
        String[] B = temp[1].split("");

        long result =0;

        for (String a : A) {
            for (String b : B) {
                result += (Integer.parseInt(a) * Integer.parseInt(b));
            }
        }
        System.out.println(result);
    }
}
