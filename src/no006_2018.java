import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no006_2018 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int S[] = new int[N + 1];
        int j = 1;
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + i;
        }

        for (int i = 1; i <= N; i++) {

            int a = S[i] - S[j - 1];
            if (a == N) {
                cnt++;
            } else if (a > N) {
                j++;
                i--;
            }
        }
        System.out.println(cnt);
    }
}
