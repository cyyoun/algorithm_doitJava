package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 골드 5
 * 2467) 용액
 * time :
 * memory :
 * review : 230927(fail)
 */
public class Q044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); //오름차순 정렬
        int min = A[0], max = A[n - 1];
        long sum = Long.MAX_VALUE;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            long newSum = (A[i] + A[j]);
            System.out.println("n = " + newSum);
            if (sum > Math.abs(newSum)) {
                sum = newSum;
                min = A[i]; max = A[j];

            }
            if (newSum >= 0) {
                i--;
            } else {
                j++;
            }

        }
        System.out.println(min + " " + max);
    }
}
