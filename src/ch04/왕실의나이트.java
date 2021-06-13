package ch04;

import java.util.Scanner;

public class 왕실의나이트 {
    public static void main(String[] args) {
        //p.115
        // x 축과 y 축이 이동할 수 있는 범위를 지정 8 개, 범위를 탐색하면서 가능한 것만 cnt + 1

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        //현재 위치
        int row = data.charAt(1) - '0';
        int col = data.charAt(0) - 96; // or data[0].charAt(0) - 'a'  + 1

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;

        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

            if (nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8) {
                result += 1;
            }
        }
        System.out.println(result);

    }
}
