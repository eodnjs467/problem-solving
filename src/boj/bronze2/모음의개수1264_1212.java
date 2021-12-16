package boj.bronze2;

import java.util.Scanner;

public class 모음의개수1264_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean Yn = true;

        String[] vowels = {"a", "e", "i", "o", "u"};

        while (Yn) {
            String[] tc = sc.nextLine().split("");
            int count = 0;

            for (String v : vowels) {
                for (String t : tc) {
                    if (t.equals("#")){
                        Yn = false;
                        break;
                    }
                    if (v.equals(t.toLowerCase())) count++;
                }
            }
            if (!Yn) break;
            else System.out.println(count);
        }
    }
}
