package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 실버 2
 * 1992) 쿼드트리
 * time :
 * memory :
 * review : 230831(fail)
 */
public class Q019 {
    static int[][] A;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                A[i][j] = line.charAt(j) - '0';
            }
        }
        splitTree(0, 0, n);
        System.out.println(sb);
    }

    private static void splitTree(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            sb.append(A[x][y]);
            return;
        }
        int newSize = size / 2;

        sb.append('(');
        splitTree(x, y, newSize);
        splitTree(x, y + newSize, newSize);
        splitTree(x + newSize, y, newSize);
        splitTree(x + newSize, y + newSize, newSize);
        sb.append(')');

    }

    private static boolean isPossible(int x, int y, int size) {
        int val = A[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (val != A[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
