package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 1912) 연속합
 * time :
 * memory :
 * review : 230908 (time fail)
 */
//https://zoonvivor.tistory.com/152 참고
public class Q029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = A[0];
        int max = A[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + A[i], A[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
