package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q032_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); //가치의 합
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        int save = k;
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] <= k) {
                cnt = cnt + save / A[i];
                save = save % A[i];
            }
            if (save == 0)
                break;
        }
        System.out.println(cnt);
    }
}
