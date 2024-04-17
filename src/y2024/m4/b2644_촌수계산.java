package y2024.m4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 24.04.17 수
 */
public class b2644_촌수계산 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static int p2, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //전체 사람 수
        StringTokenizer st = new StringTokenizer(br.readLine()); //촌수 계산 사람 관계
        int p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine()); //부모 자식들 간 관계 수

        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        DFS(p1, 0);
        System.out.println(answer == 0 ? -1 : answer-1);
    }
    private static void DFS(int num, int cnt) {
        if (visited[num]) {
            return;
        }
        cnt++;
        if (num == p2) {
            answer = cnt;
        }
        visited[num] = true;
        ArrayList<Integer> list = A[num];
        for (int i : list) {
            DFS(i, cnt);
        }
    }
}
