package programmers.lev2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] A = new int[arr1.length][arr2[0].length];


        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2[0].length; k++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    A[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }


        return A;
    }
}
