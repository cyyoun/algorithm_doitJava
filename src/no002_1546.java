import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class no002_1546 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = Stream.of(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Arrays.sort(arr);
        double maxNo = Double.valueOf(arr[arr.length-1]);
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            double score = Double.valueOf(arr[i])/maxNo*100;
            sum += score;
        }
        System.out.println(sum/N);
    }
}
