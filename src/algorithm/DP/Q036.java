package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 골드 1
 * 2293) 동전 1
 * time :
 * memory :
 * review : 230916(fail)
 */
public class Q036 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] A = new int[n + 1];
        int[] DP = new int[k + 1];
        DP[0] = 1;

        for (int i = 1; i <= n; i++) {
            A[i] = Integer.parseInt(br.readLine());
            for (int j = A[i]; j <= k; j++) {
                DP[j] += DP[j - A[i]];
            }
        }
        System.out.println(DP[k]);

    }
}
