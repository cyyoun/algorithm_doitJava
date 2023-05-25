import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no051_1976 {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //city 수
        int m = Integer.parseInt(br.readLine()); //plan city 수

        int[][] city = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int a = Integer.parseInt(st.nextToken());
                city[i][j] = a;
            }
        }

        int[] route = new int[m + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= m; i++) {
            route[i] = Integer.parseInt(st.nextToken());
        }
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (city[i][j] == 1) union(i, j);
            }
        }

        int index = find(route[1]);
        for (int i = 2; i < route.length; i++) {
            if (index != find(route[i])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            parent[b] = a;
        }
    }
    private static int find(int a) {
        if (parent[a] == a) {
            return a;
        } else {
            return parent[a] = (find(parent[a]));
        }
    }
}
