package Programmers;

import java.util.Arrays;


public class 최솟값만들기 {
    public static void main(String[] args) {

    }
    private int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            answer += A[i] * B[j];
        }
        return answer;
    }
}
