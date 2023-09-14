package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  백중 실버 1
 *  1149) RGB 거리
 *  time :
 *  memory :
 *  review : 230914(fail)
 */
public class Q034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int red = 0, green = 1, blue = 2;
        int[][] A = new int[n][3];
        int[][] DP = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i][red] = Integer.parseInt(st.nextToken());
            A[i][green] = Integer.parseInt(st.nextToken());
            A[i][blue] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            A[i][red] += Math.min(A[i - 1][green], A[i - 1][blue]);
            A[i][green] += Math.min(A[i - 1][red], A[i - 1][blue]);
            A[i][blue] += Math.min(A[i - 1][red], A[i - 1][green]);
        }
        System.out.println(Math.min(A[n - 1][red], Math.min(A[n - 1][green], A[n - 1][blue])));

    }
}
