package boj.bronze2;

import java.util.*;
import java.util.stream.Collectors;

public class 가장많은글자1371_1212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] alpha = new int[26];

        int max = 0;
        while (sc.hasNextLine()) {
            String[] sentence = sc.nextLine().replaceAll(" ", "").split("|");
            for (String s : sentence) {
                int index = s.charAt(0) -'a';
                System.out.println(alpha[index] += 1);
//                System.out.println("s : " + s + " 값 :  " + alpha[index]);
                if (max < alpha[index]) max = alpha[index];
            }
        }


        String result = "";
        for (int al : alpha) {
            if (al == max) result += al;
        }

        System.out.println(result);

        sc.close();
    }
}
