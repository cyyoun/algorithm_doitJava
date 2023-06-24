package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q013_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
         }
        while(!queue.isEmpty()) {
            int poll1 = queue.poll();
            if (queue.isEmpty()) {
                System.out.println(poll1);
                break;
            }
            int poll2 = queue.poll();
            queue.add(poll2);
        }
    }
}
