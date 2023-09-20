package algorithm.Exploration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 백준 실버 2
 * 1654) 랜선 자르기
 * time :
 * memory :
 * review : fail
 */



public class Q038 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken()); //이미 가지고 있는 랜선 개수
        int n = Integer.parseInt(st.nextToken()); //필요한 랜선 개수
        int[] A = new int[k];

        long max = 0;
        for (int i = 0; i < k; i++) {
            A[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, A[i]);
        }

        max++;
        long min = 0, mid = 0;
        while (min < max) {
            mid = (min + max) / 2;
            long cnt = 0;

            for (int i = 0; i < A.length; i++) {
                cnt += (A[i] / mid);
            }
            if (cnt < n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);

    }
}
