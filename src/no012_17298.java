import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no012_17298 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < A.length; i++) {

            while(!stack.empty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            A[stack.pop()] = -1;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            sb.append(A[i]).append(' ');
        }
        System.out.println(sb);
    }
}
