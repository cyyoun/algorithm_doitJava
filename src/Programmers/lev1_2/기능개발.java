package Programmers.lev1_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        solution(new int[]{95,90,99,99,80,99}, new int[]{1,1,1,1,1,1});

    }
    private static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> date = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int p = progresses[i];
            int s = speeds[i];
            int rem = 100 - p;
            int d = (rem / s) + (rem % s == 0 ? 0 : 1);
            date.add(d);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        int compare = date.poll();
        while (!date.isEmpty()) {
            int pollDate = date.poll();
            if (compare < pollDate) {
                compare = pollDate;
                list.add(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
            if (date.isEmpty()) {
                list.add(cnt);
            }
        }
        System.out.println(list.toString());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i);
        }


        return answer;
    }
}
