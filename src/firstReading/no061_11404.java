package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no061_11404 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //도시의 개수
        int m = Integer.parseInt(br.readLine()); //버스의 개수


        int[][] city = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) city[i][j] = 0;
                else city[i][j] = 10000001; // 기본값 최대로 설정
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //시작
            int e = Integer.parseInt(st.nextToken()); //끝
            int v = Integer.parseInt(st.nextToken()); //속도
            if (city[s][e] > v) city[s][e] = v; //기본값 및 할당된 값과 비교하여 값 대입
        }

        //플로이드-워셜 알고리즘 로직
        //D[s][e] = Math.min(D[s][e], D[s][k] + D[k][e])
        for (int k = 1; k <= n; k++) { //경유지에 관해
            for (int s = 1; s <= n; s++) { //출발 노드에 관해
                for (int e = 1; e <= n; e++) { //도착 노드에 관해 최단거리 배열 값 업데이트
                    if (city[s][e] > city[s][k] + city[k][e])
                        city[s][e] = city[s][k] + city[k][e];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (city[i][j] == 10000001) System.out.print("0 ");
                else System.out.print(city[i][j] + " ");
            }
            System.out.println();
        }
    }
}
