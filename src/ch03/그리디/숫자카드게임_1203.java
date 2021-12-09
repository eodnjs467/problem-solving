package ch03.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드게임_1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (Arrays.stream(arr[i]).min().getAsInt() > result){
                result = Arrays.stream(arr[i]).min().getAsInt();
            }
        }
        System.out.println(result);
    }
}
