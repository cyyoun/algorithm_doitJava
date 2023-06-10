package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no087_11726 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n + 1];
        A[1] = 1;
        A[2] = 2;
        for(int i = 3; i <= n; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % 10007;
        }

        System.out.println(A[n]);
    }

}
