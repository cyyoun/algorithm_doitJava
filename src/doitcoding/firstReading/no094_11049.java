package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no094_11049 {
    static int n;
    static Matrix[] M;
    static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        M = new Matrix[n + 1];
        A = new int[n + 1][n + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = -1;
            }
        }
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            M[i] = new Matrix(y, x);
        }
        System.out.println(excute(1, n));

    }

    private static int excute(int s, int e) {
        int result = Integer.MAX_VALUE;
        if (A[s][e] != -1)
            return A[s][e];
        if (s == e) // 행렬 1개 곱셈 연산 수
            return 0;
        if (s + 1 == e) // 행렬 2개 곱셈 연산 수
            return M[s].y * M[s].x * M[e].x;
        for (int i = s; i < e; i++) { // 행렬 3개 이상 곱셈 연산 수
            result = Math.min(result, M[s].y * M[i].x * M[e].x + excute(s, i) + excute(i + 1, e));
        }
        return A[s][e] = result;
    }

    static class Matrix {
        private int y;
        private int x;
        Matrix(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
