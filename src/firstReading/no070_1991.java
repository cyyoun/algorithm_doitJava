package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no070_1991 {
    static int[][] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new int[26][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = st.nextToken().charAt(0) - 'A';
            int l = st.nextToken().charAt(0);
            int r = st.nextToken().charAt(0);

            if (l == '.') {
                tree[node][0] = -1;
            } else {
                tree[node][0] = l - 'A';
            }
            if (r == '.') {
                tree[node][1] = -1;
            } else {
                tree[node][1] = r - 'A';
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }
    private static void preOrder(int item) {
        if (item == -1)
            return;
        System.out.print((char)(item + 'A'));
        preOrder(tree[item][0]);
        preOrder(tree[item][1]);
    }

    private static void inOrder(int item) {
        if (item == -1)
            return;
        inOrder(tree[item][0]);
        System.out.print((char)(item + 'A'));
        inOrder(tree[item][1]);
    }

    private static void postOrder(int item) {
        if (item == -1)
            return;
        postOrder(tree[item][0]);
        postOrder(tree[item][1]);
        System.out.print((char)(item + 'A'));

    }
}
