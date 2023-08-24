package algorithm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Q003_review1 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean result = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //n = 노드, m = 에지
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        A = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            DFS(i, 1);
            if (result) {
                break;
            }
        }
        System.out.println(result ? 1 : 0);
    }

    public static void DFS(int item, int depth) {
        if (depth == 5) {
            result = true;
            return;
        }
        visited[item] = true;
        for (int i : A[item]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[item] = false;
    }
}
