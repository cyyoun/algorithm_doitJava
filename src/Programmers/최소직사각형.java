package Programmers;

public class 최소직사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    private static int solution(int[][] sizes) {
        int w = 0, h = 0;
        for (int[] card : sizes) {
            w = Math.max(w, Math.max(card[0], card[1]));
            h = Math.max(h, Math.min(card[0], card[1]));
        }
        return w * h;
    }
}
