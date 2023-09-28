package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 골드 1
 * 1300) k번째 수
 * time :
 * memory :
 * review : 230928
 */
public class Q045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        long min = 1;
        long max = m;

        while (min < max) {
            long mid = (min + max) / 2;
            long cnt = 0;

            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            if (m <= cnt) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println("min = " + min);


    }
}
