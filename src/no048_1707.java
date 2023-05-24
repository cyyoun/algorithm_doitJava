import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no048_1707 {
    static boolean IsEven;
    static boolean[] visited;
    static int[] check;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine()); //테스트케이스

        for (int i = 0; i < k; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()); //정점 개수
            int e = Integer.parseInt(st.nextToken()); //간선 개수

            A = new ArrayList[v + 1];
            visited = new boolean[v + 1];
            check = new int[v + 1];
            IsEven = true;

            for (int j = 1; j <= v; j++) {
                A[j] = new ArrayList<>();
            }
            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                A[a].add(b);
                A[b].add(a);
            }
            for (int j = 1; j <= v; j++) {
                if (IsEven)
                    DFS(j);
                else
                    break;
            }
            if (IsEven)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
    private static void DFS(int item) {
        visited[item] = true;
        for (int node : A[item]) {
            if (!visited[node]) {
                check[node] = (check[item] + 1) % 2;
                DFS(node);
            } else if (check[item] == check[node]) {
                IsEven = false;

            }
        }
    }
}
