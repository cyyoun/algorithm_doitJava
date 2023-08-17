package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class no033_1715 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> Q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            Q.offer(Integer.parseInt(bufferedReader.readLine()));
        }

        int cnt = 0;
        while (Q.size() > 1) {
            int a = Q.poll();
            int b = Q.poll();
            int sum = (a + b);
            cnt += sum;
            if (!Q.isEmpty()) Q.offer(sum);
        }
            System.out.println(cnt);

    }
}
