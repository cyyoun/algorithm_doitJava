package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 브론즈 2
 * 2979) 트럭 주차
 * time : 124ms
 * 메모리 14144KB
 */
public class Q048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] parking = new int[101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                parking[j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i < parking.length; i++) {
            if (parking[i] == 1) {
                answer += a;
            } else if (parking[i] == 2) {
                answer += (b * 2);
            } else if (parking[i] == 3) {
                answer += (c * 3);
            }
        }
        System.out.println(answer);
    }
}
