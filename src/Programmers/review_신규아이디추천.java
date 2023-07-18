package Programmers;

public class review_신규아이디추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }

    private static String solution(String new_id) {
        String ans = "";
        String temp = new_id.toLowerCase();
        temp = temp.replaceAll("[^-_.a-z0-9]", "");
        temp = temp.replaceAll("[..]{2,}", ".");
        temp = temp.replaceAll("^[.]|[.]$","");
        if(temp.equals(""))
            temp = "a";
        if (temp.length() >= 16) {
            temp = temp.substring(0, 15);
            temp = temp.replaceAll("[.]$", "");
        }
        if (temp.length() <= 2) {
            while (temp.length() < 3) {
                temp += temp.charAt(temp.length() - 1);
            }
        }
        ans = temp;
        return ans;
    }
}
