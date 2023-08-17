package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no031_1300 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        long start = 1, end = k;
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for (int i = 0; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }

            if (cnt < k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
