package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}));
    }
    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < goal.length; i++) {
            String g = goal[i];
            if (a < cards1.length && cards1[a].equals(g)) {
                a++;
            } else if (b < cards2.length && cards2[b].equals(g)) {
                b++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
