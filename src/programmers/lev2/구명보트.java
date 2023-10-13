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

    public int solution2(int[] people, int limit) {

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int cnt = 0;

        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                left++;
                right--;
                cnt++;
            } else {
                right--;
                cnt++;
            }
        }

        return cnt;
    }
}
