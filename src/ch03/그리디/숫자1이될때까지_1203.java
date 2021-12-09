package ch03.그리디;

import java.util.Scanner;

public class 숫자1이될때까지_1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        while(N!=1){
            if (N%K==0){
                N/=K;
            }else{
                N -= 1;
            }
            count++;
        }
        System.out.println(count);

    }
}
