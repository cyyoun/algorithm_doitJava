package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] DP = new int[n + 1][m + 1];
        int iMax = -1;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                DP[i][j] = Integer.parseInt(st.nextToken());
                iMax = Math.max(DP[i][j-1], Math.max(DP[i - 1][j - 1], DP[i - 1][j]));
                DP[i][j] += iMax;
            }
        }
        System.out.println(DP[n][m]);


    }
}
