package Programmers.lev1_2;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        int[] R = solution("banana");
        System.out.println(Arrays.toString(R));
    }

    private static int[] solution(String s) {
        char[] C = s.toCharArray();
        int[] A = new int[C.length];

        for (int i = 0; i < C.length; i++) {
            A[i] = -1;
        }

        for (int i = 1; i < C.length; i++) {
            for(int k = i - 1, j = 1; k >= 0; k--, j++) {
                if (C[i] == C[k]) {
                    A[i] = j;
                    break;
                }
            }
        }

        return A;
    }
}
