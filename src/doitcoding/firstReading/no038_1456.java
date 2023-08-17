package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no038_1456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long m = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());


        long[] A = new long[10000001];

        for (int i = 2; i < A.length; i++)
            A[i] = i;

        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0) continue;

            for (int j = i + i; j < A.length; j = j + i){
                A[j] = 0;
            }
        }
        int cnt = 0;
        for (int i = 2; i < 10000001; i++) {
            if (A[i] != 0) {
                long b = A[i];
                while ((double)(A[i]) <= (double)n / (double)b){
                    if ((double)(A[i]) >= (double)m / (double)b) {
                        cnt++;
                    }
                    b *= A[i];
                }
            }
        }
        System.out.println(cnt);
    }
}
