package programmers.lev1_2;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        int n = 10;
        int[] lost = {1, 10};
        int[] reserve = {2, 9};
        System.out.println(solution(n, lost, reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int[] A = new int[n];
        Arrays.fill(A, 1);

        for (int i = 0; i < lost.length; i++) {
            A[lost[i] - 1] = 0;
        }

        for (int i = 0; i < reserve.length; i++) {
            if (A[reserve[i] - 1] == 0) {
                A[reserve[i] - 1] = 1;
            } else {
                A[reserve[i] - 1] = 2;
            }
        }


        for (int i = 0; i < n; i++) {
            if (A[i] == 2){
                if (i - 1 >= 0 && A[i - 1] == 0) {
                    A[i - 1] = 1;
                    A[i] = 1;
                } else if (i + 1 < n && A[i + 1] == 0) {
                    A[i + 1] = 1;
                    A[i] = 1;
                } else {
                    A[i] = 1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 1)
                answer++;
        }

        return answer;
    }
}
