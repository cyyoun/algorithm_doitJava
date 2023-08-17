package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q011_1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> A = new Stack<>();
        StringBuilder bf = new StringBuilder();
        int k = 0;

        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(br.readLine());

            while (k < m) {
                k++;
                A.push(k);
                bf.append("+\n");
            }

            if (A.peek() == m) {
                A.pop();
                bf.append("-\n");
            } else if (A.peek() > m) {
                bf.append("NO");
                break;
            }
        }
        System.out.println(bf.toString().contains("NO") ? "NO" : bf.toString().trim());

    }

}
