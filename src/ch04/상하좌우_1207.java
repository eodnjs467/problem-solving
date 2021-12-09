package ch04;

import java.util.Scanner;

public class 상하좌우_1207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String[] plan = sc.nextLine().split(" ");
        String[][] matrix = new String[n+1][n+1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] = "(" + i + "," + j + ")";
            }
        }
        int x = 1;
        int y = 1;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        String[] moveType = {"D", "U", "R", "L"};

        for (String p : plan) {
            for (int i = 0; i < moveType.length; i++) {
//                System.out.println("p.getClass().getName()" + p.getClass().getName());
//                System.out.println("moveType[i].getClass().getName()" + moveType[i].getClass().getName());
//                System.out.println(p + " , " + moveType[i]);
//                System.out.println(p==moveType[i]);
                if (p.equals(moveType[i])){
                    System.out.println(i +" 번 인덱스 , dx=" +  dx + ", dy=" + dy);
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    System.out.println(nx + ", " + ny);

                    if (nx < 1 || nx > 5 || ny < 1 || ny > 5) continue;
                    x = nx;
                    y = ny;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
