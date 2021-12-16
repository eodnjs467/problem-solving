package boj.bronze2;

import java.util.Scanner;

public class 하얀칸1100_1210 {
    public static void main(String[] args) {
        //https://www.acmicpc.net/problem/1100

        Scanner sc = new Scanner(System.in);

        String[][] matrix = new String[8][8];   //고정값은 final int SIZE = 8 이런식으로 해도된당

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String[] n = sc.nextLine().split("|");
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = n[j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0 && j % 2 == 0 && matrix[i][j].equals("F")) { //(i+j)%2==0 && matrix[i][j].equals("F") 해도 되는구나 ....
                    count++;
                } else if (i % 2 != 0 && j % 2 != 0 && matrix[i][j].equals("F")){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
