package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no084_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n + 1];
        A[1] = 0;

        for (int i = 2; i <= n; i++) {
            A[i] = A[i - 1] + 1;
            if(i % 2 == 0) A[i] = Math.min(A[i], A[i / 2] + 1);
            if(i % 3 == 0) A[i] = Math.min(A[i], A[i / 3] + 1);
        }
        System.out.println( A[n]);
    }
}
