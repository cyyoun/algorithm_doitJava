package Programmers;

public class 이진변환반복하기 {
    public static void main(String[] args) {

    }
    private static int[] solution(String s) {
        int changeCnt = 0;
        int zeroCnt = 0;
        while (!s.equals("1")) {
            int oneCnt = s.replace("0", "").length();
            zeroCnt += s.length() - oneCnt;
            s = binary(oneCnt);
            changeCnt++;
        }

        return new int[]{changeCnt, zeroCnt};
    }

    //Integer.toBinaryString(str); 으로 대체가능함..!!!!!
    private static String binary(int num) {
        String b = "";
        while (true) {
            b += String.valueOf(num % 2);
            if (num != 1) {
                num /= 2;
            } else {
                break;
            }
        }
        return b;
    }
}
