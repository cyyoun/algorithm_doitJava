package Programmers.lev2;

public class 숫자의표현 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }


    public static int solution(int n) {
        int answer = 0;
        int sum = 1;
        int start = 1;
        int end = 1;

        while (start <= end) {
            if (end > n) {
                break;
            }

            if (sum == n) {
                answer++;
                sum += ++end;
                sum -= start++;
            } else if (sum < n) {
                sum += ++end;
            } else {
                sum -= start++;
            }
        }

        return answer;


    //프로그래머스 참조
/*        int answer = 0;
        for (int i = 1; i <= n; i += 2)
            if (n % i == 0)
                answer++;

        return answer;*/
    }
}
