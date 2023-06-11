package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no088_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int mod = 1000000000;
        long A[][] = new long[n + 1][11];
        for (int i = 1; i <= 9; i++) {
            A[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            A[i][0] = A[i - 1][1];
            A[i][9] = A[i - 1][8];

            for (int j = 1; j <= 8; j ++) {
                A[i][j] = (A[i - 1][j - 1] + A[i - 1][j - 1]) % mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + A[n][i]) % mod;
        }
        System.out.println(sum);
    }
}
