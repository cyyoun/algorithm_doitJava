package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q040_1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        boolean[] A = new boolean[(int) (m - n + 1)];

        for (long i = 2; i * i <= m; i++) { //2의 제곱 수인 4부터 반복
            long k = i * i;
            long start_idx = k;

            if (!A[(int)k]) {
                A[(int)k] = true;
            }
        }
        int cnt = 0;
        for (long i = 1; i <= m - n; i++) {
            if (!A[(int)i])
                cnt++;
        }
        System.out.println(cnt);
    }
}
