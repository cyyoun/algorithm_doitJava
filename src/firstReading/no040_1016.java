package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no040_1016 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        boolean[] chk = new boolean[(int) (m - n + 1)];

        for (int i = 2; i <= m; i++) {

            long p = i * i;
            long start_index = n / p;
            if (n % p != 0)
                start_index++;
            for (long j = start_index; p * j <= m; j++) {
                chk[(int) ((j * p) - n)] = true;
            }
        }

        int cnt = 0;
        for (int i = 0; i <= m - n; i++) {
            if (!chk[i]) cnt++;
        }
        System.out.println(cnt);

    }
}
