package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q2072 {
    static int[][] A;
    static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new int[19][19];

        boolean result = false;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int chk = i % 2 != 0 ? 1 : 2;

            if(gomoku(a, b, chk)) {
                result = true;
                cnt = i;
            }
        }
        if (!result)
            System.out.println(-1);
        else
            System.out.println(cnt);

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    private static boolean gomoku(int a, int b, int chk) {
        A[a][b] = chk;
        int[] cnt = {1, 1, 1, 1};
        for (int i = 0; i < 8; i++) {
            int row = a + dr[i];
            int col = b + dc[i];
            while (row >= 0 && col >= 0 && row < 19 && col < 19 && A[row][col] == chk) {
                row += dr[i];
                col += dc[i];
                cnt[i % 4]++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (cnt[i] == 5) {
                return true;
            }
        }
        return false;
    }
}
