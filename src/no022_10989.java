import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no022_10989 {
        public static void main (String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(bufferedReader.readLine());
            }

            Arrays.sort(arr);

            for (int c : arr) {
                sb.append(c).append("\n");
            }
            System.out.println(sb);
    }
}
