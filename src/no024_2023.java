import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no024_2023 {

    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }
    private static void DFS(int a, int b) {

        if (b == N) {
            if (isPrime(a)) {
                System.out.println(a);
            }
            return;
        }


        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(a * 10 + i)) {
                DFS(a * 10 + i, b + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i ==0)
                return false;
        }
        return true;
    }
}
