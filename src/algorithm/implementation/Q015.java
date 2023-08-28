package algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 4
 * 1244) 스위치 켜고 끄기
 * time : 144ms
 * memory : 14500KB
 * review : 230828
 */
public class Q015 {
    static int[] A;
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //스위치 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[n + 1];
        for (int i = 1; i <= n; i++) { //스위치 상태
            A[i] = Integer.parseInt(st.nextToken());
        }
        int su = Integer.parseInt(br.readLine()); //학생 수
        for (int i = 0; i < su; i++) {
            st = new StringTokenizer(br.readLine());
            int gen = Integer.parseInt(st.nextToken()); //성별
            int num = Integer.parseInt(st.nextToken()); //받은 수
            if (gen == 1) man(num);
            else woman(num);

        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                sb.append(A[i] + "\n");
            } else if (i == n) {
                sb.append(A[i]);
                break;
            } else {
                sb.append(A[i] + " ");
            }
        }
        System.out.println(sb);
    }

    public static void man(int num) {
        for (int i = num; i <= n; i += num) {
            A[i] = A[i] == 0 ? 1 : 0;
        }
    }

    public static void woman(int num) {
        A[num] = A[num] == 0 ? 1 : 0;
        for (int i = num - 1, j = num + 1; j <= n && i >= 1; j++, i--) {
            if (A[i] == A[j]) {
                A[i] = A[i] == 0 ? 1 : 0;
                A[j] = A[i];
            } else {
                break;
            }
        }
    }
}
