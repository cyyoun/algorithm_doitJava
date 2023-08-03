package Programmers.lev2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
    }
    static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i : priorities) {
            queue.offer(i);
        }
        Arrays.sort(priorities);
        int seq = 0;
        for (int i = priorities.length - 1; i >= 0; i--) {
            int max = priorities[i];
            while (true) {
                location = location < 0 ? queue.size() - 1 : location;
                if (queue.peek() == max) {
                    queue.poll();
                    seq++;
                    if (location == 0) {
                        return seq;
                    }
                    location--;
                    break;
                } else if (queue.peek() < max) {
                    queue.offer(queue.poll());
                    location--;
                }
            }
        }
        return 0;
    }
}
