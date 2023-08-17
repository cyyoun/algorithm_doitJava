package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 백준 골드 5
 * 13023) 친구 관계 파악하기
 * time :
 * memory :
 * review : 230817(fail)
 * point : 친구 관계가 5명인 경우 -> 5깊이가 형성되는지 찾는 문제
 */
public class Q003 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //사람 수
        int m = Integer.parseInt(st.nextToken()); //관계 수
        visited = new boolean[n];
        A = new ArrayList[n];
        arrive = false;

        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);

        }
        /**
         * 각 노드에서 5깊이가 존재하는지 모두 확인함.
         */

        for (int i = 0; i < n; i++) {
            DFS(i, 1); // 깊이 1부터 시작
            if (arrive) break; //깉이 5 지점에서 중단
        }
        if(arrive) System.out.println(1);
        else System.out.println(0);

    }
    private static void DFS(int item, int depth) {
        if (depth == 5 || arrive) { // 깊이 5 지점에서 중단
            arrive = true;
            return;
        }
        visited[item] = true;
        for (int i : A[item]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[item] = false;
        /**
         * 그렇기 때문에  visited[item] = false; 와 같이 초기화 작업을 해주는거임
         *
         */

    }
}
