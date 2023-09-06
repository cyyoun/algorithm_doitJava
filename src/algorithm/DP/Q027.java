package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 11055) 가장 큰 증가하는 부분 수열
 * time :
 * memory :
 * review : 230906(fail)
 */
public class Q027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }
        int result = dp[1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);
                    result = Math.max(result, dp[i]);
                }
            }
        }
        System.out.println(result);
    }
}
