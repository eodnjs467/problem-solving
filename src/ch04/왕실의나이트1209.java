package ch04;

import java.util.Scanner;

public class 왕실의나이트1209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] position = sc.nextLine().split("|");

        int x = position[0].charAt(0);
        int y = Integer.parseInt(position[1]);

//        System.out.println(position[0].charAt(0) - "a".charAt(0) + 1);

        int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
        int[] dy = {2, 2, 1, -1, -2, -2, -1, 1};
        int count = 0;

        for (int j = 0; j < dx.length; j++) {
            int nx = x + dx[j];
            int ny = y + dy[j];
            if (nx<97 || nx >104 || ny<1 || ny>8) continue;
            count ++;
        }
        System.out.println(count);





    }
}
