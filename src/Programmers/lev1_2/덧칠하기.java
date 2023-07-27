package Programmers.lev1_2;

import java.util.Arrays;

public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[]{2, 3, 6}));
    }
    private static int solution(int n, int m, int[] section) {
        int cnt = 1;
        int roller = section[0];

        for (int i = 1; i < section.length; i++) {
            if (roller + m - 1 < section[i]) {
                cnt++;
                roller = section[i];
            }
        }


//        boolean[] A = new boolean[n + 1];
//        int cnt = 0;
//        for (int j = 0; j < section.length; j++) {
//            int sect = section[j];
//            boolean cntChk = false;
//            if (!A[sect]) {
//                for (int i = 0; i < m; i++) {
//                    int idx = sect + i;
//                    if (idx <= n && !A[idx]) {
//                        A[idx] = true;
//                        cntChk = true;
//                    } else if (idx > n) {
//                        break;
//                    }
//                }
//            }
//            if (cntChk)
//                cnt++;
//
//        }
//        return cnt;

        return cnt;
    }
}
