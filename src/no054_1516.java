import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no054_1516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //건물의 종류

        ArrayList<Integer>[] A = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        int[] times = new int[n + 1];
        int[] indegree = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            times[i] = Integer.parseInt(st.nextToken());

            while (true) {
                int k = Integer.parseInt(st.nextToken());
                if (k == -1) {
                    break;
                }
                A[k].add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            if (indegree[i] == 0)
                queue.add(i);

        }
        int[] result = new int[n + 1];
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : A[now]) {
                indegree[i]--;
                result[i] = Math.max(result[i], result[now] + times[now]);
                if (indegree[i] == 0) {
                    queue.add(i);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            System.out.println(result[i] + times[i]);
        }
    }
}
