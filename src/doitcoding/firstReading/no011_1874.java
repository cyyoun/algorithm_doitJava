package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no011_1874 {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> S = new Stack<>();
        int k = 0;
        StringBuilder bf = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int M = Integer.parseInt(br.readLine());

            while (k < M) {
                k++;
                S.push(k);
                bf.append("+\n");
            }

            if (S.peek() == M) {
                S.pop();
                bf.append("-\n");
            } else if (S.peek() > M) {
                bf.append("NO");
                break;
            }
         }
        System.out.println(bf.toString().contains("NO") ? "NO" : bf.toString().trim());
    }
}
