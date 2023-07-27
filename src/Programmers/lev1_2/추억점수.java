package Programmers.lev1_2;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        int[] A = solution(name, yearning, photo);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> nameMap = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            nameMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String getName = photo[i][j];
                int getYearning = 0;
                if (nameMap.containsKey(getName)) {
                    getYearning = nameMap.get(getName);
                }
                sum += getYearning;
            }
            answer[i] = sum;
        }

        return answer;
    }

}
