package algorithm.DP;
/**
 * 백준 실버 2
 * 1699) 제곱수의 합
 * time : 160ms
 * memory : 14964KB
 * review : 230905
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q026 {
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
            int cnt = 1000;
            for (int j = (int) Math.sqrt(i); j >= 1; j--) {
                int item = i - j * j;
                cnt = Math.min(cnt, 1 + A[item]);
            }
            A[i] = cnt;
        }
        System.out.println(A[n]);
    }
}
