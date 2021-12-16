package boj.bronze2;

import java.util.*;

public class 농구경기1159_1210 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        char[] player = new char[n];

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            player[i] = sc.nextLine().charAt(0);
            if (result.containsKey(player[i])){
//                int temp = result.get(player[i]);
                result.replace(player[i], result.get(player[i]) + 1);
//                result.put(player[i], );
            }else{
                result.put(player[i], 1);
            }
        }


        String str = "";
        for (Character key : result.keySet()) {
            if (result.get(key) >= 5){
                str += key;
            }
        }

        if (str.equals("")){
            System.out.println("PREDAJA");
        }else{
            System.out.println(str);
            System.out.println(str.equals("bk"));
        }






    }
}
