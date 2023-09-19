package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 4
 * 2578) 빙고
 * time : 128ms
 * memory : 14128KB
 * review : 230824
 */
public class Q011 {
    static int[][] bingo;
    static int[][] calling;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bingo = new int[5][5];
        calling = new int[5][5];
        StringTokenizer line;
        for (int i = 0; i < 5; i++) {
            line = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        boolean stopFlag = false;
        for (int i = 0; i < 5; i++) {
            line = new StringTokenizer(br.readLine());
            if (stopFlag) break;
            for (int j = 0; j < 5; j++) {
                int callNum = Integer.parseInt(line.nextToken());
                drawBingo(callNum);
                int gameCnt = i * 5 + j + 1;
                if (gameCnt >= 12) {
                    chkBingo();
                    if (cnt >= 3) {
                        stopFlag = true;
                        System.out.println(gameCnt);
                        break;
                    }
                }
            }
        }
    }

        private static void drawBingo ( int callNum){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bingo[i][j] == callNum) bingo[i][j] = 0;
                }
            }
        }

    private static void chkBingo() {
        cnt = 0;
        for (int i = 0; i < 5; i++) {
            int xChk = 0, yChk = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) xChk++;
                if (bingo[j][i] == 0) yChk++;
                if (xChk == 5) cnt++;
                if (yChk == 5) cnt++;
            }
        }
        if (bingo[0][0] == 0 && bingo[1][1] == 0 &&
                bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0) {
            cnt++;
        }
        if (bingo[0][4] == 0 && bingo[1][3] == 0 &&
                bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0) {
            cnt++;
        }
    }
}