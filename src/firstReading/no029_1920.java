package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no029_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);

        int m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            boolean find = false;

            int start = 0;
            int end = A.length - 1;

            while (start <= end) {
                int midi = (start + end) / 2;
                int midv = A[midi];

                if (a < midv) {
                    end = midi - 1;
                } else if (a > midv) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else
                System.out.println(0);
        }
    }
}





