package algorithm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q005_review1 {
    static int m, n;
    static boolean[][] visited;
    static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(A[n - 1][m - 1]);

    }

    private static void BFS(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        q.offer(new int[]{a, b});

        while (!q.isEmpty()) {
            int[] arrPoll = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = dx[i] + arrPoll[0];
                int y = dy[i] + arrPoll[1];
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (!visited[x][y] && A[x][y] == 1) {
                        visited[x][y] = true;
                        A[x][y] = A[arrPoll[0]][arrPoll[1]] + 1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
