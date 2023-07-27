package Programmers.lev2;

public class 타겟넘버 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));


    }

    static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;

    }

    static int dfs(int[] numbers, int n, int sum, int target) {
        if (n == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);

    }
}
