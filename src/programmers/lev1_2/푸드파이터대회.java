package programmers.lev1_2;

public class 푸드파이터대회 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    private static String solution(int[] food) {
        String left = "";
        String right = "";

        for (int i = 1; i < food.length; i++) {
            int d = (int)Math.ceil(food[i] / 2);
            System.out.println(d);
            while (d > 0) {
                right = String.valueOf(i) + right;
                left = left + String.valueOf(i);
                d--;
            }
        }
        return left + "0" + right;
    }
}
