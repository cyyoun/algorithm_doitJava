package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q005_10986 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] S = new long[n + 1]; //합 배열
        long[] A = new long[m]; //나머지 배열
        st = new StringTokenizer(br.readLine());


        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            S[i] = S[i - 1] + num;

            int remainder = (int)(S[i] % m);
            A[remainder]++;
        }

        long cnt = A[0];
        for (int i = 0; i < m; i++) {
            if(A[i] > 1) {
                long item = A[i] * (A[i] - 1) / 2;
                cnt += item;
            }
        }
        System.out.println(cnt);
    }
}
