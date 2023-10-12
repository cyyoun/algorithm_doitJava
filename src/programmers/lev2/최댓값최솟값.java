package programmers.lev2;

import java.util.StringTokenizer;

public class 최댓값최솟값 {
    public String solution(String s) {

        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int su = Integer.parseInt(st.nextToken());
            min = Math.min(min, su);
            max = Math.max(max, su);
        }

        return min + " " + max;


    }
}
