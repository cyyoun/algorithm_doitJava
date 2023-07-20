package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }
    private static int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

        int acnt = 0;
        int bcnt = 0;
        int ccnt = 0;
        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if (ans == a[i % a.length]) {
                acnt++;
            }
            if (ans == b[i % b.length]) {
                bcnt++;
            }
            if (ans == c[i % c.length]) {
                ccnt++;
            }
        }


        int maxScore = Math.max(acnt, Math.max(bcnt, ccnt));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == acnt) {list.add(1);}
        if(maxScore == bcnt) {list.add(2);}
        if(maxScore == ccnt) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
