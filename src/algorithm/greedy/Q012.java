package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * 백준 실버 4
 * 11508) 2+1 세일
 * time : 420ms
 * memory : 27568KB
 * review : 230826
 */
public class Q012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A, Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) result += A[i];
            else if (i % 3 == 1) result  += A[i];
            else continue;
        }
        System.out.println(result);
    }
}
