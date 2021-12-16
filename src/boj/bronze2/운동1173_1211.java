package boj.bronze2;

import java.util.Scanner;

public class 운동1173_1211 {
    public static void main(String[] args) {
        // 초기 맥박 : m, 운동 시 : T , 맥박 X, 최대맥박 M, 휴식 : R, 운동시간 : N
        // 운동시  X + T <= M, 휴식시 X-R > m


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        int X = m;

        int count =0;

        if (X+T>M){
            System.out.println("-1");
        }else{
            while (N > 0) {
                if (X+T<=M){
                    X += T;
                    N -= 1;
                    count++;
                } else if (X + T > M) {
                    if (X - R < m) {
                        X = m;
                    }else{
                        X -= R;
                    }
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
