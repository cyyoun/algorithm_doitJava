package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class no014_11286 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2) -> {
                if (Math.abs(o1) == Math.abs(o2))
                    return o1 > o2 ? 1 : -1;
                else return Math.abs(o1) - Math.abs(o2); // 절댓값을 기준으로 정렬하기
        });

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            if (k != 0) Q.offer(k);
            else {
                if (Q.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(Q.poll());
            }
        }
    }
}
