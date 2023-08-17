package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q027_review {
    static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int[][] A;
    static boolean[][] visited;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        n = Integer.parseInt(line.split(" ")[0]);
        m = Integer.parseInt(line.split(" ")[1]);
        A = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(A[n - 1][m - 1]);
    }
    static void BFS(int a, int b) {
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{a, b});
        visited[a][b] = true;
        boolean flag = false;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            for (int i = 0; i < 4; i++) {
                int dx = x + direction[i][0];
                int dy = y + direction[i][1];
                if (dx >= 0 && dy >= 0 && dx < n && dy < m && A[dx][dy] == 1) {
                   if (!visited[dx][dy]) {
                       visited[dx][dy] = true;
                       A[dx][dy] = A[x][y] + 1;
                       q.offer(new int[]{dx, dy});
                    }
                }
            }
            if (flag) {
                break;
            }
        }
    }
}