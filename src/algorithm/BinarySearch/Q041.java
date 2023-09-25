package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 2805) 나무 자르기
 * time :
 * memory :
 * review : 230925(fail)
 */
public class Q041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //나무의 수
        int m = Integer.parseInt(st.nextToken()); //가져가려는 나무 길이
        st = new StringTokenizer(br.readLine());

        int[] A = new int[n];
        long left = 0, right = -1;

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, A[i]);
        }

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i : A) {
                if (i > mid) sum += i - mid;
            }
            if (sum >= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
            System.out.println(right);

    }
}
