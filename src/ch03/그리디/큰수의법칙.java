package ch03.그리디;

import java.util.*;
import java.util.stream.Collectors;

public class 큰수의법칙 {
    public static void main(String[] args) {
        //p.92
        //배열크키 N, 더해지는 횟수 M , 연속 가능 횟수 K

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int first = arr[N - 1];
        int second = arr[N - 2];

        // 가장 큰 수 더해지는 횟 수 계산
        int cnt = (M / (K + 1)) * K;
        cnt += M % (K + 1);

        int result = 0;

        result += cnt * first;
        result += (M - cnt) * second;

        System.out.println(result);

    }
}
//입력예시 : 5 8 3 / 2 4 5 4 6
//출력예시 : 46
//풀이 : 입력예시를 풀어보면 가장 큰수 6, 두번째 5, 반복가능횟수는 3번 -> {6, 6, 6, 5} .. 가 반복된다.
// 즉, 큰수의 반복횟수(cnt)는  = (반복횟수 m / (가능횟수 k +1))  *  k 가능횟수 라는 식이 된다. 반복횟수가 나누어 떨어지지 않을경우도 생각해줘야 하므로 cnt = cnt + m%k+1
// 두번쨰로 큰 수는 반복횟수에서 큰 수 반복횟수 를 뺀 수에 * 두번째 큰 수 하면 된다.