package programmers.lev2;

public class 멀리뛰기2 {
    public long solution(int n) {
        long[] A = new long[n + 1];
        int r = 1234567;
        A[1] = 1;
        if (n == 1) return 1;
        A[2] = 2;
        for (int i = 3; i <= n; i++) {
            A[i] = ((A[i - 1] % r) + (A[i - 2] % r)) % r;
        }

        return A[n];
    }
}
