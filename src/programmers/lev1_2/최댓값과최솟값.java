package programmers.lev1_2;

import java.util.Arrays;

public class 최댓값과최솟값 {

    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -4 1 0 -8"));

    }
    private static String solution(String s) {
        int[] A = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = A[0];
        int max = A[0];

        for (int i : A) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return min + " " + max;
    }


}
