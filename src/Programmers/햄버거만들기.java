package Programmers;

public class 햄버거만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
    private static int solution(int[] ingredient) {
        //1빵 2야채 3고기 : 1231 이면 햄버거 1개
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;

        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
            && stack[sp - 2] == 3
            && stack[sp - 3] == 2
            && stack[sp -4] ==1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}
