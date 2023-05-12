import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class no013_2164 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }

        while (Q.size() >= 1) {
            if (Q.size() == 1) {
                System.out.println(Q.peek());
                break;
            } else if (Q.size() >= 2) {
                Q.remove();
                Q.offer(Q.poll());
            }
        }
    }
}
