package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no078_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine()); //층
            int b = Integer.parseInt(br.readLine()); //호
            int[][] A = new int[15][15];

            for (int j = 0; j < 15; j++) {
                A[0][j] = j + 1;
                A[j][0] = 1;
            }
            for (int j = 1; j < 15; j++) {
                for (int k = 1; k < 15; k++) {
                    A[j][k] = A[j][k - 1] + A[j - 1][k];
                }
            }
            System.out.println(A[a][b - 1]);
        }
    }
}
