package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 2512) 예산
 * time :
 * memory :
 * review : 230923(fail)
 */
public class Q040 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int korea = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int min = 0, max = -1;
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, A[i]);
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            int budget = 0;
            for (int i : A) {
                if (i > mid) budget += mid;
                else budget += i;
            }
            if (budget > korea) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(max);
    }
}
