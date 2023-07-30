package Programmers.lev2;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 6, 7}));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        for (int i = 1; i <= citations.length; i++) {
            int hcnt = 0;
            int lcnt = 0;
            for (int j : citations) {
                if (j >= i) {
                    hcnt++;
                } else {
                    lcnt++;
                }
            }
            if (hcnt >= i && lcnt <= i) {
                answer = Math.max(answer, i);
            }
        }
        return answer;
    }
}
