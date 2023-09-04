package algorithm.DP;
/**
 * 백준 실버 3
 * 11726) 2 x n 타일링
 * time : 132ms
 * memory : 14316KB
 * review : 230904
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n + 1];
        if (n == 1) {
            System.out.println(1);
            return;
        }
        A[1] = 1;
        A[2] = 2;

        for (int i = 3; i <= n; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % 10007;
        }
        System.out.println(A[n]);
    }
}
