package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 실버 1
 * 10844) 쉬운 계단 수
 * time :
 * memory :
 * review : 230910(fail)
 */

public class Q031 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.startsWith("0"))  return;
        int n = Integer.parseInt(s);
        int su = 1000000000;
        long[][] A = new long[n + 1][10];

        for (int i = 1; i <= 9; i++) {
            A[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    A[i][j] = A[i - 1][1] % su;
                } else if (j == 9) {
                    A[i][j] = A[i - 1][8] % su;
                } else {
                    A[i][j] = (A[i - 1][j - 1] + A[i - 1][j + 1]) % su;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += A[n][i];
        }
        System.out.println(ans % su);
    }
}
