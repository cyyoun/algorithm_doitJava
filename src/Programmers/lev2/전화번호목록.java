package Programmers.lev2;

public class 전화번호목록 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"123", "1005", "1006", "1007"}));
    }
    static boolean solution(String[] phoneBook) {
        for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}
