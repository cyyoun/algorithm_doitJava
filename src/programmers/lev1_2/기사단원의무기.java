package programmers.lev1_2;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));

    }

    private static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] cnt = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                cnt[i * j]++;
            }
        }
        for (int i = 1; i <= number; i++) {
            if (cnt[i] > limit) {
                answer += power;
            } else {
                answer += cnt[i];
            }
        }
        return answer;
    }
}
