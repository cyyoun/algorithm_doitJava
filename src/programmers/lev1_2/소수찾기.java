package programmers.lev1_2;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j = j + i) {
                A[j] = 0;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (A[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
