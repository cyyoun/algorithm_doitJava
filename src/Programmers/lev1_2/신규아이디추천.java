package Programmers.lev1_2;

public class 신규아이디추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm..."));
    }

    private static String solution(String new_id) {

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9\\-_.s]", "");
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.equals("") ? "a" : new_id;
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.endsWith(".") ? new_id.substring(0, new_id.length() - 1) : new_id ;
        }
        if (new_id.length() <= 2) {
            char i = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id = new_id + String.valueOf(i);
            }
        }
        return new_id;


        /**
         * String answer = "";
         *         String temp = new_id.toLowerCase();
         *
         *         temp = temp.replaceAll("[^-_.a-z0-9]","");
         *         System.out.println(temp);
         *         temp = temp.replaceAll("[.]{2,}",".");
         *         temp = temp.replaceAll("^[.]|[.]$","");
         *         System.out.println(temp.length());
         *         if(temp.equals(""))
         *             temp+="a";
         *         if(temp.length() >=16){
         *             temp = temp.substring(0,15);
         *             temp=temp.replaceAll("^[.]|[.]$","");
         *         }
         *         if(temp.length()<=2)
         *             while(temp.length()<3)
         *                 temp+=temp.charAt(temp.length()-1);
         *
         *         answer=temp;
         *         return answer;
         *
         * */










    }
}
