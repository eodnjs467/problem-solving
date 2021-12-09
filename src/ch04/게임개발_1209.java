package ch04;

import java.util.Scanner;

public class 게임개발_1209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] NM = sc.nextLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);

        String[] position = sc.nextLine().split(" ");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        int move = Integer.parseInt(position[2]);

        int[] moveType = {0, 1, 2, 3};
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int[][] matrix = new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                matrix[i][j] = -1;
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m + 1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//
//        for (int[] i : matrix) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        boolean Yn = true;
        int visited = 0;

        while (Yn) {
            int count =0;

            for (int i = 0; i < 4; i++) {
                if ((move-1) < 0) move = 4;
                int nx = x + dx[move - 1];
                int ny = y + dy[move - 1];
                move = moveType[move - 1];

                //전진 못하면 회전 해야함
                if (matrix[nx][ny] == -1 || matrix[nx][ny] == 1) {
                    count++;
                }else if (matrix[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    matrix[x][y] = 1;
                    visited++;
                }

                if (count == 4) {
                    move = moveType[move +1];
                    nx = x + dx[move + 1];
                    ny = y + dy[move + 1];

                    if (matrix[nx][ny] == 1) {
                        Yn = false;
                        break;
                    }
                    Yn = false;
                    break;
                }

            }
        }

        System.out.println("visited : " + visited);


    }
}
