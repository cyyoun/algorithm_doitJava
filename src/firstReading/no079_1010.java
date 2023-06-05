package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no079_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 29;
        int[][] A = new int[num + 1][num + 1];

        for (int i = 0; i <= num; i++) {
            A[i][i] = 1;
            A[i][0] = 1;
            A[i][1] = i;
        }
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                A[i][j] = A[i - 1][j] + A[i - 1][j - 1];
            }
        }

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(A[b][a]);
        }
    }
}
