import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class no034_1744 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < 0 && o2 < 0)
                    return Integer.compare(o1, o2); //내림
                else
                    return Integer.compare(o2, o1); //내림
            }
        });

        for (int i = 0; i < n; i++)
            q.offer(Integer.parseInt(bufferedReader.readLine()));

        int result = 0;
        boolean zero = false;

        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            if ((a > 0 && b > 0) || (a < 0 && b < 0)){
                if (a == b) {
                    result = result + a + b;
                } else result += (a * b);
            } else if (a > 0 && b == 0) {
                result += a;
                zero = true;
            } else if (a == 0 && b < 0) {
                q.offer(b);
                zero = true;
            } else if (a > 0 && b < 0) {
                result += a;
                q.offer(b);
            }
        }

        if (q.size() == 1) {
            int k = q.poll();
            if (zero) {
                if (k > 0) result += k;

            }else
                result += k;
        }
        System.out.println(result);
    }
}
