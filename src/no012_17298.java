import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no012_17298 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int j = i + 1;
            if (j == N) {
                bf.append(-1+" ");
                break;
            }
            int b = A[j];

            while (j < N) {
                if (a < b) {
                    bf.append(b + " ");
                    break;
                } else {
                    j++;
                    if (j == N) {
                        bf.append(-1 + " ");
                        break;
                    }
                    b = A[j];
                }
            }
        }
        System.out.println(bf.toString().trim());
    }
}
