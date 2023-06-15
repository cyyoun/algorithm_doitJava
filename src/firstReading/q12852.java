package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n + 1];
        int[] C = new int[n + 1];

        A[1] = 0;
        for (int i = 2; i <= n; i++) {
            A[i] = A[i - 1] + 1;
            C[i] =  i - 1;
            if (i % 2 == 0 && A[i / 2] + 1 < A[i]) {
                A[i] = A[i / 2] + 1;
                C[i] = i / 2;
            }
            if (i % 3 == 0 && A[i / 3] + 1 < A[i]) {
                A[i] = A[i / 3] + 1;
                C[i] = i / 3;
            }
        }
        System.out.println( A[n]);
        String str = "";
        while (n > 0) {
            str += n + " ";
            n = C[n];

        }
        System.out.println(str);
    }
}
