package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] A = new int[n];
        int start = 0, end = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (start < A[i])
                start = A[i];
            end += A[i];

        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0, cnt = 0;
            for (int i = 0; i < n; i++) {
                if (sum + A[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += A[i];
            }
            if (sum != 0)
                cnt++;
            if (cnt > m)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println(start);
    }
}
