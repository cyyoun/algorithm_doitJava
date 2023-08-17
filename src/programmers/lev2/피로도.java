package programmers.lev2;

public class 피로도 {
    static boolean[] chk;
    static int answer = 0;
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

    static int solution(int k, int[][] dungeons) {

        chk = new boolean[dungeons.length];
        DFS(k, dungeons, 0);
        return answer;
    }

    private static void DFS(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!chk[i] && dungeons[i][0] <= k) {
                chk[i] = true;
                DFS(k - dungeons[i][1], dungeons, cnt + 1);
                System.out.println("(k - dungeons[i][1] = " + (k - dungeons[i][1]));
                chk[i] = false;
                System.out.println("chk["+i+"] = " + chk[i]);
            }
        }
        answer = Math.max(answer, cnt);
    }
}
