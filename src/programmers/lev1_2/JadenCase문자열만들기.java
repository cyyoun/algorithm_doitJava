package programmers.lev1_2;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        System.out.println(solution("ddd dd efwfs"));
    }
    private static String solution(String s) {
        String ans = "";
        String[] split = s.toLowerCase().split("");
        boolean flag = true;
        for (String str : split) {
            ans += flag ? str.toUpperCase() : str;
            flag = str.equals(" ") ? true : false;
       }
        return ans;
    }
}
