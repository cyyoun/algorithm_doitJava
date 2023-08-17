package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no081_1722 {
    public static void main(String[] args) throws IOException {
        int n, q;
        long F[] = new long[21];
        int S[] = new int[21];
        boolean visited[] = new boolean[21];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 자릿수
        st = new StringTokenizer(br.readLine());
        q = Integer.parseInt(st.nextToken());

        F[0] = 1;
        for (int i = 1; i <= n; i++) {
            F[i] = F[i - 1] * i; //팩토리얼 초기화..!
        }

        if (q == 1) {
            long K = Long.parseLong(st.nextToken());
            for (int i = 1; i <= n; i++) {
                for (int j = 1, cnt = 1; j <= n; j++) {
                    if (visited[j])
                        continue;
                    System.out.println("K = " + K);
                    System.out.println("cnt = " + cnt);
                    System.out.println("F[n - i] = " + F[n - i]);
                    if (K <= cnt * F[n - i]) {
                        K -= ((cnt - 1) * F[n - 1]);
                        S[i] = j;
                        visited[j] = true;
                        break;
                    }
                    cnt++;

                }
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(S[i] + " ");
            }
        } else {
            long K = 1;
            for (int i = 1; i <= n; i++) {
                S[i] = Integer.parseInt(st.nextToken());
                long cnt = 0;
                for (int j = 1; j < S[i]; j++) {
                    if (visited[j] == false) {
                        cnt++;
                    }
                }
                K += cnt * F[n - i];
                visited[S[i]] = true;
            }
            System.out.println(K);
        }
    }
}
