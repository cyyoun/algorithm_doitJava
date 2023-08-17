package programmers.lev2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 튜플 {
    public int[] solution(String s) {
        String[] arr = s.replace("{{", "")
                .replace("}}", "")
                .split("\\},\\{");
        arr = Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        int len = arr[arr.length - 1].split(",").length;
        ArrayList<String> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < len; i++) {
            String[] A = arr[i].split(",");
            for (String str : A) {
                if (!answer.contains(str)) {
                    answer.add(str);
                    break;
                }
            }
        }
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            result[i] = Integer.parseInt(answer.get(i));
        }

        return result;
    }
}
