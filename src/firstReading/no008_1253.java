package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no008_1253 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] S = new long[N];

        for (int i = 0; i < N; i++){
            S[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        Arrays.sort(S);

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = 0;
            int b = N - 1;

            while (a < b) {

                if (S[a] + S[b] == S[i]) {
                    if (a != i && b != i) {
                        cnt++;
                        break;
                    } else if (a == i) {
                        a++;
                    } else if (b == i) {
                        b--;
                    }
                } else if (S[a] + S[b] < S[i]) {
                    a++;
                } else {
                    b--;
                }
            }
        }
        System.out.println(cnt);
        bufferedReader.close();
     }
}
