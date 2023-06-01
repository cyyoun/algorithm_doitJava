package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no003_11659 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bufferedReader.readLine());
        int[] S = new int[N+1];
        int A = 0;

        for (int i = 1; i <= N; i++) {
            int item = Integer.parseInt(st.nextToken());
            A += item;
            S[i] = A;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(S[b] - S[a-1]);
        }
    }
}
