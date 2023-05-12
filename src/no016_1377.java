import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class no016_1377 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] B = A.clone();
        Arrays.sort(B);

        int max = 0;
        for (int i = 0; i < N ; i++) {
            int idx = Arrays
                    .stream(B)
                    .boxed()
                    .collect(Collectors.toList())
                    .indexOf(A[i]);
            if (max < i - idx)
                max = i - idx;
        }
        System.out.println(max + 1);
    }
}
