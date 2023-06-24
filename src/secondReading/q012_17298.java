package secondReading;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class q012_17298  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < n; i++) {
            System.out.println("stack.peek() = " + stack.peek());
            System.out.println("A[stack.peek()] = " + A[stack.peek()]);
            System.out.println("A[i] = " + A[i]);
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                result[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}
