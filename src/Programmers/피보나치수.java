package Programmers;

public class 피보나치수 {
    public static void main(String[] args) {
        System.out.println(solution(3));

    }
    private static int solution(int n) {

        long[] A = new long [n + 1];
        A[0] = 0;
        A[1] = 1;
        for (int i = 2 ; i <= n; i++) {
            A[i] = (A[i - 1] +  A[i - 2]) % 1234567;
        }
        return (int)A[n];
    }


}
