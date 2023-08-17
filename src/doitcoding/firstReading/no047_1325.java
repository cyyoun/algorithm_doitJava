package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no047_1325 {
    static int answer[];
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //컴퓨터 개수(노드)
        int m = Integer.parseInt(st.nextToken()); //신뢰 관계 개수(에지)

        A = new ArrayList[n + 1];
        answer = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            BFS(i);
        }

        int maxVal = 0;
        for (int i = 0; i <= n; i++) {
            maxVal = Math.max(maxVal, answer[i]); //이런 방법이!...
        }
        for (int i = 0; i <= n; i++) {
            if (answer[i] == maxVal)
                System.out.print(i + " ");
        }
    }

    private static void BFS(int item) {
        Queue<Integer> q = new LinkedList<>();
        q.add(item);
        visited[item] = true;
        while (!q.isEmpty()) {
            int n = q.poll();
            for (int i : A[n]) {
                if (visited[i] == false) {
                    visited[i] = true;
                    answer[i]++;
                    q.add(i);
                }
            }
        }
    }
}
