package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 1012) 유기농 배추
 */
public class Q054 {
    static int m, n, k;
    static int[][] cabbage;
    static boolean[][] visited;
    static int cnt;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<int[]>();
        qu.add(new int[] { x, y });

        while (!qu.isEmpty()) {
            x = qu.peek()[0];
            y = qu.peek()[1];
            visited[x][y] = true;
            qu.poll();
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < m && cy < n) {
                    if (!visited[cx][cy] && cabbage[cx][cy] == 1) {
                        qu.add(new int[] { cx, cy });
                        visited[cx][cy] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int c = 0; c < t; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            cabbage = new int[m][n];
            visited = new boolean[m][n];
            cnt = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;

            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (cabbage[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}


