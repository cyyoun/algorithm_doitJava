package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 골드 5
 * 12865) 평범한 배낭
 * time:
 * memory:
 * date: 2301017
 */
public class Q055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //물품의 수
        int k = Integer.parseInt(st.nextToken()); //버틸 수 있는 무게

        int[][] dp = new int[n + 1][k + 1];
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken()); //각 물건의 무게
            v[i] = Integer.parseInt(st.nextToken()); //물건의 가치
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - w[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
