package programmers.lev2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int answer = 0;
        while (start <= end) {
            int sum = people[start] + people[end];
            if (sum > limit) {
                answer++;
                end--;
            } else if (sum <= limit) {
                answer++;
                end--;
                start++;
            }
        }
        return answer;
    }
}
