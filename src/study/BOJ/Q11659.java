package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());
        int[] A = new int[n+1];
        int k = 0;

        for (int i = 1; i <= n; i++) {
            int item = Integer.parseInt(st.nextToken());
            k += item;
            A[i] = k;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(A[b] - A[a - 1]);
        }
    }
}
