package org.example;

public class MatrixMultiplication {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length; j++) {

                for (int k = 0; k < arr1[i].length; k++) {

                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }
}
