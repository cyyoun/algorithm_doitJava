package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no077_11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] A = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            A[i][i] = 1;
            A[i][0] = 1;
            A[i][1] = i;
        }

        //모듈러 연산 : (A mod N + B mod N) = (A + B)mod N
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j ++) {
                A[i][j] = A[i - 1][j] + A[i-1][j - 1];
                A[i][j] = A[i][j] % 10007;
            }
        }
        System.out.println(A[n][m]);
    }
}
