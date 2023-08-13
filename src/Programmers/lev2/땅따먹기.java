package Programmers.lev2;

public class 땅따먹기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{3, 4, 2, 1}, {3, 2, 5, 5}, {2, 4, 5, 2}, {3, 1, 9, 3}}));

    }

    public static int solution(int[][] land) {
        return hopscotch(land,0, -1);
    }

    public static int hopscotch(int[][] land, int row, int col) {
        if (row >= land.length) {
            return 0;
        }
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            if (i != col)
                answer = Math.max(hopscotch(land, row + 1, i) + land[row][i], answer);
        }
        return answer;
    }
}
