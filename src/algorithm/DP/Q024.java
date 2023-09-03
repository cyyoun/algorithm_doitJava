package algorithm.DP;

import java.io.*;

public class Q024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] A = new long[n + 1];

        if (n == 1) {
            bw.write("1\n");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        A[1] = 1;
        A[2] = 2;
        for (int i = 3; i <= n; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % 15746;
        }
        bw.write(A[n] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
