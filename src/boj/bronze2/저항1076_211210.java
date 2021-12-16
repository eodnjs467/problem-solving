package boj.bronze2;

import java.util.*;

public class 저항1076_211210 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        Map<String, Integer> colorMap = new HashMap<>();
        String[] tempColor = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < tempColor.length; i++) {
            colorMap.put(tempColor[i], (int)Math.pow(10, i));
        }

        Long converter = (long) Integer.parseInt(Arrays.asList(tempColor).indexOf(a) + "" + Arrays.asList(tempColor).indexOf(b));
        Long result = converter * colorMap.get(c);

        System.out.println(result);








    }
}
