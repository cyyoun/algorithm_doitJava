import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no026_1260 {

    static StringBuffer sb;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static Queue<Integer> Q;



    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int v = Integer.parseInt(stringTokenizer.nextToken());

        A = new ArrayList[n + 1];
        Q = new LinkedList<>();
        // arraylist 초기화
        for (int i = 1; i <= n; i++)
            A[i] = new ArrayList<Integer>();

        for (int i = 1; i <= m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            // 양방향
            A[a].add(b);
            A[b].add(a);
        }
        sb = new StringBuffer();
        visited = new boolean[n + 1];
        DFS(v);
        System.out.println(sb);

        sb = new StringBuffer();
        visited = new boolean[n + 1];
        Q.offer(v);
        BFS(v);

        System.out.println(sb);
    }

    private static void BFS(int v) {
        visited[v] = true;


        while (!Q.isEmpty()) {
            int item = Q.poll();
            Collections.sort(A[item]);
            for (int i : A[item]) {
                if (!visited[i]) {
                    visited[i] = true;
                    Q.offer(i);
                }
            }
            sb.append(item + " ");
        }
    }


    private static void DFS(int v) {
        visited[v] = true;
        sb.append(v + " ");
        Collections.sort(A[v]);

        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
