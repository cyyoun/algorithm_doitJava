package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        System.out.println(
                solution(new String[]{"TR", "RT", "TR"},
                new int[]{7, 1, 3}));
    }


    private static String solution(String[] survey, int[] choices) {
        int[] arr = {3, 2, 1, 0, 1, 2, 3};
        String[] charArr = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            map.put(charArr[i], 0);
        }


        for (int i = 0; i < survey.length; i++) {
            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1, 2);
            String val1 = choices[i] <= 4 ? a : b;
            map.put(val1, map.getOrDefault(val1, 0) + arr[choices[i] - 1]);
        }

        String result = "";
        result = (map.get("R") >= map.get("T") ? "R" : "T") +
                (map.get("C") >= map.get("F") ? "C" : "F") +
                (map.get("J") >= map.get("M") ? "J" : "M") +
                (map.get("A") >= map.get("N") ? "A" : "N");
        return result;
    }
}
