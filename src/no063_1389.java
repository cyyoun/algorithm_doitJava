import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no063_1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int[][] A = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j ) A[i][j] = 0;
                else A[i][j] = 1000001;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a][b] = 1;
            A[b][a] = 1;
        }

        for (int k = 1; k <= n; k++) {
            for (int s = 1; s <= n; s++) {
                for (int e = 1; e <= n; e++) {
                    A[s][e] = Math.min(A[s][e], A[s][k] + A[k][e]);
                }
            }
        }

        int index = 0;
        int sum = 1000001;
        for (int i = 1; i <= n; i++) {
            int rowSum = 0;
            for (int j = 1; j <= n; j++) {
                rowSum += A[i][j];
            }
            if (rowSum < sum) {
                sum = rowSum;
                index = i;

            }
        }
        System.out.println(index);
    }
}

