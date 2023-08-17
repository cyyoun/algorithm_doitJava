package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class q014_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 > abs2)
                    return 1;
                 else if (abs1 < abs2)
                    return -1;
                 else
                  return o1 - o2;
            }
        });

        for (int i = 0; i < n; i++) {
            int item = Integer.parseInt(br.readLine());
            if (item != 0) {
                pq.offer(item);
            } else {
                if (pq.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(pq.poll());
            }
        }
    }
}
