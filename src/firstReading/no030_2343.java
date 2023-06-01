package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no030_2343 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] A = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
           if (start < A[i]) start = A[i]; // start - 최댓값
            end += A[i]; // end - 합계
        }

        while (start <= end) {
            int mid = (start + end) / 2; // 중앙값
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (sum + A[i] > mid) {
                    cnt ++;
                    sum = 0;
                }
                sum += A[i];
            }
            if (sum != 0) cnt ++;
            if (cnt > m)
                start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(start);
    }
}
