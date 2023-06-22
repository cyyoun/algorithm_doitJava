package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class q006_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n + 1]; //합 배열

        for (int i = 1; i <= n; i++) {
            A[i] = A[i - 1] + i;
        }


        int cnt = 0;
        for (int i = 1, j = 1; j <= n; j ++) {
            int ij = A[j] - A[i - 1];

            if(ij == n) {
                cnt ++;
                i++;
            } else if (ij > n) {
                i++;
                j--;
            }
        }
        System.out.println(cnt);
    }
}
