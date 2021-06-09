package ch03.그리디;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 숫자카드게임 {
    public static void main(String[] args) {
        //p.97

        //각 행에서 가장 작은수 고르고  비교해서 큰 수 고르면 됨

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int min = 10001;
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }

        Arrays.sort(result);

        System.out.println(result[n-1]);



    }
}
