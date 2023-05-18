import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no032_11047 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringBuffer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringBuffer.nextToken());
        int m = Integer.parseInt(stringBuffer.nextToken());

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            int coin = A[i];
            if (coin <= m) {
                int k = m / coin;
                cnt += k;
                m = m - (coin * k);
            }
            if (m == 0) {
                break;
            }
        }
            System.out.println(cnt);
    }
}
