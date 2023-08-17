package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no027_2178 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int n, m;
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[n][m];
        A = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = String.valueOf(bufferedReader.readLine());

            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(s.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(A[n - 1][m - 1]);

    }
    private static void BFS(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a, b});
        visited[a][b] = true;

        while (!q.isEmpty()) {
            int now[] = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if ( x >= 0 && y >= 0 && x < n && y < m) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
