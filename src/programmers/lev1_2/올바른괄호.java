package programmers.lev1_2;

public class 올바른괄호 {
    public static void main(String[] args) {

    }
    static boolean solution(String s) {
       boolean answer = false;
       int cnt = 0;

       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '(') {
               cnt++;
           } else if (s.charAt(i) == ')') {
               cnt--;
           }
           if (cnt < 0) {
            break;
           }
       }
       if (cnt == 0) {
           answer = true;
       }
        return answer;
    }
}
