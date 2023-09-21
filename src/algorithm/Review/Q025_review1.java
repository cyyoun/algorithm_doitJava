package algorithm.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q025_review1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] A = new long[n + 1];

        if (n == 1) {
            System.out.println(1);
            return;
        }
        A[1] = 1;
        A[2] = 2;
        for (int i = 3; i <= n; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % 15746;
        }
        System.out.println(A[n]);
        br.close();
    }

}
