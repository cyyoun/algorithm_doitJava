package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class no035_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            A[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) { // 2차원 배열 정렬
                if (start[1] == end[1]) {
                    return start[0] - end[0];
                }
                return start[1] - end[1];
            }
        });

        int cnt = 0;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if (A[i][0] >= end) {
                A[i][1] = end;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
