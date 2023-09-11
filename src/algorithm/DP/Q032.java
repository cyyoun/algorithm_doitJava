package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 실버 1
 * 11057) 오르막 수
 * time : 124ms
 * memory : 14304KB
 * review : 230911
 */
public class Q032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //길이
        int mod =  10007;
        long[][] A = new long[n + 1][10];

        for (int i = 0; i <= 9; i++) {
            A[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = j; k <= 9; k++) {
                    A[i][j] += (A[i - 1][k] % mod);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += A[n][i];
        }
        System.out.println(ans % mod);
    }
}
