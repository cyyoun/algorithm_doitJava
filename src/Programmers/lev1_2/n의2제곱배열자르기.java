package Programmers.lev1_2;

import java.util.Arrays;

public class n의2제곱배열자르기 {
    public static void main(String[] args) {
        System.out.println("solution(4, 7, 14 ,) = " + Arrays.toString(solution(4, 7L, 14L)));
    }
    private static int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] A = new int[size];

        int v = 0;
        left += 1;
        for (int idx = 0; idx < size; idx++) {
            if (left % n == 0) {
                v = (int) (left / n) + 1;
                A[idx] = n;
            } else if (left % n <= v) {
                A[idx] = v;
            } else {
                A[idx] =(int) left % n;
            }
            left++;
        }
        return A;
    }
}
