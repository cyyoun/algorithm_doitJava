import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class no017_1427 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] A = Stream.of(String.valueOf(N).split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(A);

        for (int i = A.length - 1; i >= 0; i--) {
            System.out.print(A[i]);
        }
    }
}

