package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no076_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // nCm = [n-1][m-1] + [n-1][m]
        int result = Combination(n, m);
        System.out.println(result);
    }
    private static int Combination(int a, int b) {
        int sub = a - b;
        if (sub == 0) {
            return 1;
        } else {
            int parent = 1;
            int child = 1;
            for (int i = b; i >= 1; i--) {
                parent *= a;
                child *= b;
                a--;
                b--;
            }

            return parent / child;

        }
    }
}
