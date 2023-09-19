package algorithm.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 백준 실버 1
 * 1931) 회의실 배정
 * time :636ms
 * memory : 71624KB
 * review : 230829
 */
public class Q016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] A = new int[n][2];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            A[i][0] = a;
            A[i][1] = b;
        }
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] - o2[1] == 0) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });


        int cnt = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int a = A[i][0];
            int b = A[i][1];
            if (a >= end) {
                end = b;
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
