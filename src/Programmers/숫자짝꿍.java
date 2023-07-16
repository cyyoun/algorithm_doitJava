package Programmers;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
    }
    private static String solution(String X, String Y) {
        long[] visitX = new long[10];
        long[] visitY = new long[10];
        StringBuffer answer = new StringBuffer();
        answer.append("");

        for (char i : X.toCharArray()) {
            visitX[Integer.parseInt(String.valueOf(i))]++;
        }
        for (char i : Y.toCharArray()) {
            visitY[Integer.parseInt(String.valueOf(i))]++;
        }

        for (int i = visitX.length - 1  ; i >= 0 ; i--) {
            long cnt = Math.min(visitX[i], visitY[i]);
            while (cnt > 0) {
                answer.append(i);
                cnt--;
            }
        }

        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.substring(0, 1).equals("0")){
            return "0";
        } else {
            return answer.toString();
        }
    }
}
