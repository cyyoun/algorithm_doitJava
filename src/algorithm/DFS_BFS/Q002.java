package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 골드 5
 * 2023) 신기한 소수 찾기
 * time : 124ms
 * memory : 14192KB
 * review : 230817 230818(14084KB, 124ms)
 */
public class Q002 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] primeNum = {2, 3, 5, 7};

        for (int i : primeNum) {
            primeNumDFS(i, 1);
        }
    }

    private static void primeNumDFS(int prime, int cnt) {
        if (cnt == n) {
            System.out.println(prime);
            return;
        }
        cnt++;
        for (int i = 1; i < 10; i = i + 2) {
            int newPrime = prime * 10 + i;
            if (primeNumChk(newPrime)) {
               primeNumDFS(newPrime, cnt);
            }
        }
    }

    private static boolean primeNumChk(int prime) {
        for (int i = 3; i < (int) Math.sqrt(prime) + 1; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
