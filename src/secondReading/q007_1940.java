package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q007_1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int cnt = 0;
        for (int i = 0, j = (n - 1); i < n; i++) {
            if (i < j) {
                int sum = A[i] + A[j];
                if (sum == m) {
                    cnt++;
                    j--;
                } else if (sum > m) {
                    i--;
                    j--;
                }
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}
