package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 6236) 용돈 관리
 * time :
 * memory :
 * review : 230925(fail)
 */
public class Q042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
            max += A[i];
            if (min < A[i])
                min = A[i];
        }
        while (min <= max) {
            int mid = (min + max) / 2;
            int cnt = 0, sum = 0;
            for (int i : A) {
                if (sum + i > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += i;
                if (sum != 0) cnt ++;
            }
            if (cnt > m) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(min);
    }
}
