package ch04;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        //p.110

        // 입력만큼 이동 후 위치 출력

        // 방향문제 .. 푸는 법 .. 오래돼서 까먹었는데 다시 공부해따 ..nx, ny 가 -1 로 설정해야하는 이유 알았고,
        // 버퍼비우기 하는 이유(개행문자) 숙지, 걍 전체적으로 세부적으로 전부 이해하고 학습됐음.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  //버퍼비우기
        String[] plans = sc.nextLine().split(" ");

        int x=1, y=1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for (String plan : plans) {
            char temp = plan.charAt(0);
            int nx = -1, ny = -1;
            for (int i = 0; i < 4; i++) {
                if (temp == moveTypes[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            if (nx<1 || ny<1 || nx>n || ny>n) continue;

            x = nx;
            y = ny;

        }

        System.out.println(x + " " + y);


    }
}
