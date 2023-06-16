package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 비트 연산자
 * & 모두 1이면 1 반환
 * | 하나라도 1 이면 1반환
 * ^ 대응되는 비트면 1을 반호나
 * ~ 1이면 0, 0이면 1
 * << 지정 수만큼 비트를 전부 왼쪽으로 이동
 * >> 상동, 오른쪽으로 이동
 *
 */
public class Q11723_집합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int s = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String calc = st.nextToken();
            if (calc.equals("all")) {
                s = (1 << 21) - 1;
            } else if (calc.equals("empty")) {
                s = 0;
            } else {
                int su = Integer.parseInt(st.nextToken());
                switch (calc) {
                    case "add":
                        s |= (1 << su);
                        break;
                    case "remove":
                        s &= ~(1 << su);
                        break;
                    case "check":
                        sb.append((s & (1 << su)) != 0 ? 1 : 0).append("\n");
                        break;
                    case "toggle":
                        s ^= (1 << su);
                }
            }
        }
        System.out.println(sb);
    }
}
