package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());

        int left = 1;
        int right = M;

        int now = Integer.parseInt(br.readLine());
        if (now > M) {
            result += now - M;
            right = now;
            left = now - (M - 1);
        }

        for (int i = 0; i < J - 1; i++) {
            int next = Integer.parseInt(br.readLine());
            if (next > now && next > right) {
                result += next - right;
                right = next;
                left = next - (M - 1);
            } else if (next < now && next < left) {
                result += left - next;
                right = next + (M - 1);
                left = next;
            }
            now = next;
        }
        System.out.println(result);
    }
}
