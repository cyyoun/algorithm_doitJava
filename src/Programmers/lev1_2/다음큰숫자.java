package Programmers.lev1_2;

public class 다음큰숫자 {
    public static void main(String[] args) {


    }
    private static int solution(int n){
     int answer = n;
     int oneCnt = Integer.toBinaryString(n).replace("0", "").length();
     int ansCnt = 0;
     while (true) {
         answer += 1;
         ansCnt = Integer.toBinaryString(answer).replace("0", "").length();
         if (ansCnt == oneCnt) {
             break;
         }
     }

     return answer;
    }
}
