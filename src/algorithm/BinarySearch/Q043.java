package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 골드 4
 * 2110) 공유기 설치
 * time :
 * memory :
 * review : 230926..
 */
public class Q043 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //집의 개수
        int m = Integer.parseInt(st.nextToken()); //공유기 개수
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A);
        int min = 1;
        int max = A[n - 1] - A[0] + 1;
        while (min < max) {
            int mid = (min + max) / 2;
            int cnt = 1; //첫번 째 위치에는 무조건 공유기 하나 설치
            //공유기 개수 확인
            int lastLocate = A[0];
            for (int i : A) {
                if (i - lastLocate >= mid) {
                    lastLocate = i;
                    cnt++;
                }
            }
            if (cnt < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);

    }
}
