package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no086_2193 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] A = new long[n + 1][2];

        A[1][0] = 0;
        A[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            A[i][0] = A[i - 1][0] + A[i - 1][1];
            A[i][1] = A[i - 1][0];
        }
        System.out.println(A[n][0] + A[n][1]);


    }
}
