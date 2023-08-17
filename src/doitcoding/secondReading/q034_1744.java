package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class q034_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minusQ = new PriorityQueue<>();
        PriorityQueue<Integer> plusQ = new PriorityQueue<>(Collections.reverseOrder());


        int sum = 0;
        for (int i = 0; i < n; i++) {
            int item = Integer.parseInt(br.readLine());
            if (item <= 0)
                minusQ.add(item);
            else if (item == 1)
                sum++;
            else
                plusQ.add(item);
        }

        while (!minusQ.isEmpty()) {
            int item = minusQ.poll();
            if (minusQ.size() >= 1)
                item *= minusQ.poll();
            sum += item;
        }

        while (!plusQ.isEmpty()) {
            int item = plusQ.poll();
            int item2 = 0;
            if (plusQ.size() >= 1) {
                item2 = plusQ.poll();
                item *= item2;
            }
            sum += item;
        }

        System.out.println(sum);
    }
}
