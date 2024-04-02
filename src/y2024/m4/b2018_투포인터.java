package y2024.m4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24.04.02
 */
public class b2018_투포인터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1; //n 자기 자신 하나인 경우에도 포함해서 합산하기에 1인 듯
        int s = 1, e = 1, sum = 1;
        while (e != n) { //가장 큰 값은 자기자신 하나인 경우이기에 e != n 성립
            if (sum == n) {
                result++;
                e++;
                sum += e;
            } else if (sum < n) {
                e++;
                sum += e;
            } else {
                sum -= s;
                s++;
            }
        }
        System.out.println(result);
    }
}
