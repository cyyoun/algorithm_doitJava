package programmers.lev2;

public class N개의최소공배수 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
    }

    static int solution(int[] arr) {

        //A와 B의 최소공배수 = A X B ÷ A와 B의 최대공약수
        //최소공약수 (유클리드 호제법)
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a = lcm(a, arr[i]);
        }
        return a;
    }

    //최소공배수
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //최대공약수
    static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

}
