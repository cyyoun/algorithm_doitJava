package algorithm.DP;
/**
 * 백준 실버 3
 * 2193) 이친수
 * time : 124ms
 * memory : 14144KB
 * review : 230902
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] A = new long[n + 1];
        A[0] = 0;
        A[1] = 1;

        for (int i = 2; i <= n; i++) {
            A[i] = A[i - 1] + A[i - 2];
        }
        System.out.println(A[n]);

    }
}
