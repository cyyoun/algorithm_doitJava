package algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 백준 실버 4
 * 1206) 등수 구하기
 * time :
 * memory :
 * review : 230912
 */
public class Q033 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //점수 개수
        int score = Integer.parseInt(st.nextToken()); //새로운 점수
        int p = Integer.parseInt(st.nextToken()); //랭킹에 올라갈 수 있는 점수 개수

        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        if (n == p && A[n - 1] >= score) {
            System.out.println(-1);
            return;
        }
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (A[i] > score) rank++;
            else break;
        }
        System.out.println(rank);
    }
}
