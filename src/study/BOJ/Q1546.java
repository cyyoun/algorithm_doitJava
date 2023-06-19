package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Q1546 {
    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bufferedReader.readLine());
        int[] A = Stream.of(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(A);
        double maxNo = Double.valueOf(A[A.length-1]);
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double score = Double.valueOf(A[i])/maxNo*100;
            sum += score;
        }
        System.out.println(sum/n);
    }
}

