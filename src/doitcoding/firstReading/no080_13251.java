package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no080_13251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pick = Integer.parseInt(br.readLine());

        int sum = 0;
        int allSum = 0;
        for (int i = 0; i < n; i++) {
            int su = Integer.parseInt(st.nextToken());
            allSum += su;
            sum += Combination(su, pick);
        }

        int combi = Combination(allSum, pick);
        double result = combi > 0 ? (double)sum / (double)combi : 0.0;

        System.out.println(result);
    }

    private static int Combination(int a, int b) {
        if (a < b) {
            return 0;
        } else {
            int[][] A = new int[a + 1][a + 1];

            for (int i = 1; i <= a; i++) {
                A[i][i] = 1;
                A[i][0] = 1;
                A[i][1] = i;
            }
            for (int i = 2; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    A[i][j] = A[i - 1][j] + A[i - 1][j - 1];
                }
            }
            return A[a][b];
        }
    }
}
