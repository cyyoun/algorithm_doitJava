package Programmers.lev1_2;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static boolean solution(int x) {

        int sum = 0;
        for (char i : String.valueOf(x).toCharArray()) {
            sum += Integer.parseInt(String.valueOf(i));
        }
        return x % sum == 0;
    }
}
