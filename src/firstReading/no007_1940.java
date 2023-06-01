package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no007_1940 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] S = new int[N];

        for (int i = 0; i < N; i++) {
            int item = Integer.parseInt(stringTokenizer.nextToken());
            S[i] = item;
        }
        Arrays.sort(S);

        int cnt = 0;
        int j = N - 1;
        for (int i = 0; i < j; i++) {
            int sum = S[i] + S[j];
            if (sum > M) {
                j--;
                i--;
            } else if (sum == M) {
                cnt++;
                j--;
            }
        }
        System.out.println(cnt);
    }
}
