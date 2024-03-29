package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no067_11725 {
    static int n;
    static boolean[] visited;
    static ArrayList<Integer> tree[];
    static int answer[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        tree = new ArrayList[n + 1];
        answer = new int[n + 1];


        for (int i = 0 ; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        DFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void DFS(int num) {
        visited[num] = true;
        for (int i : tree[num]) {
            if (!visited[i]) {
                answer[i] = num;
                DFS(i);
            }
        }
    }
}
