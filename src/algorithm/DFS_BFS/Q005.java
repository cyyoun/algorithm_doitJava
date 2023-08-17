package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 백준 실버 1
 * 2178) 미로 탐색하기
 * time : 156ms
 * memory : 15672KB
 * review : 230817
 */
public class Q005 {
    static int[][] A;
    static boolean[][] visited;
    static int m, n;
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

    private static void BFS(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a, b});
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = arr[0] + dx[i];
                int y = arr[1] + dy[i];
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (!visited[x][y] && A[x][y] == 1) {
                        visited[x][y] = true;
                        q.offer(new int[]{x, y});
                        A[x][y] = A[arr[0]][arr[1]] + 1;
                    }
                }
            }
        }


    }
}
