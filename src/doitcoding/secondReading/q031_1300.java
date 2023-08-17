package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class q031_1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        long start = 1, end = m;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            if (cnt < m) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
            System.out.println(result);
    }
}
