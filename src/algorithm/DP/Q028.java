package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 9465) 스티커
 * time :
 * memory :
 * review : 230907(fail)
 */
//참고 : https://fbtmdwhd33.tistory.com/76
public class Q028 {
    static int[][] dp, cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int n = Integer.parseInt(br.readLine());
            cost = new int[2][n + 1];
            dp = new int[2][n + 1];

            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    cost[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][1] = cost[0][1];
            dp[1][1] = cost[1][1];

            //dp[0][0], dp[1][0] 은 어차피 0이여서 상관없었네
            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + cost[0][j]; //cost[0][j] 그저 원래 위치 값 더해주는 것 뿐
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + cost[1][j];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n])); // 행이 2개니깐 두 가지 결과가 나올 수 있음
        }
    }
}
