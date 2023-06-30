package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q028_1167 {
    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //노드 개수

        A = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1)
                    break;
                int v = Integer.parseInt(st.nextToken());
                A[s].add(new Edge(e, v));
            }
        }
        distance = new int[n + 1];
        visited = new boolean[n + 1];

        BFS(1);
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (distance[max] < distance[i]) {
                max = i;
            }
        }
        distance = new int[n + 1];
        visited = new boolean[n + 1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[n]);
    }

    private static void  BFS(int item) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(item);
        visited[item] = true;
        while (!queue.isEmpty()) {
            int pollItem = queue.poll();
            for (Edge i : A[pollItem]) {
                int e = i.e;
                int v = i.v;

                if (!visited[e]) {
                    distance[e] = distance[pollItem] + v; // ★★★
                    visited[e] = true;
                    queue.add(e);
                }
            }
        }
    }

    public static class Edge {
        int e;
        int v;
        public Edge(int e, int v) {
            this.e = e;
            this.v = v;
        }
    }
}
