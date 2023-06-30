package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2667 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int n, m;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && !visited[i][j]) {
                    BFS(i, j);
                    System.out.println(cnt);
                }
            }
        }
    }
    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        cnt = 0;
        while (!queue.isEmpty()) {
            int[] pollItem = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = pollItem[0] + dx[k];
                int y = pollItem[1] + dy[k];

                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("A[x][y] = " + A[x][y]);
                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        cnt++;
                        visited[x][y] = true;
                        A[x][y] = A[pollItem[0]][pollItem[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
