package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class no064_1197 {
    static int[] A;
    static PriorityQueue<Edge> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //노드의 개수
        int m = Integer.parseInt(st.nextToken()); //에지의 개수


        queue = new PriorityQueue<>();
        A = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i] = i;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            queue.add(new Edge(s, e, v));
        }
        int useEdge = 0;
        int result = 0;
        while (useEdge < n - 1) {
            Edge now = queue.poll();
            if(find(now.s) != find(now.e)) {
                union(now.s, now.e);
                result += now.v;
                useEdge++;
            }
        }
        System.out.println(result);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b)
            A[b] = a;
    }
    private static int find(int item) {
        if (item == A[item]) {
            return item;
        } else {
            return A[item] = find(A[item]);
        }
    }
}

class Edge implements Comparable<Edge> {
    int s;
    int e;
    int v;
    Edge(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compareTo(Edge o) {
        return this.v - o.v;
    }
}