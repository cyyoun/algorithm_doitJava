package y2024.m4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 24.04.02
 */
public class b1940_투포인터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int len = st.countTokens();
        for (int i = 0; i < len; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int s = 0, e = n - 1;
        int result = 0;
        while (s < e) {
            int sum = A[s] + A[e];
            if (sum == m) {
                result++;
                s++;
                e--;
            } else if (sum < m) {
                s++;
            } else {
                e--;
            }
        }
        System.out.println(result);
        br.close();
    }
}
