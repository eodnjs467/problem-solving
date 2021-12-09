package ch03.그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 큰수의법칙_1203 {
    public static void main(String[] args) {
//        N 개받고 M번 더하고 한 숫자 K번 초과 x

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int result = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        arr = Arrays.stream(arr).sorted().toArray();

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (count < K) {
                result += arr[N - 1];
                count ++;
            }else{
                result += arr[N - 2];
                count = 0;
            }

        }
        System.out.println(result);
    }
}
