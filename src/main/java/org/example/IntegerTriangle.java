package org.example;

public class IntegerTriangle {

    public int solution(int[][] triangle) {

        int[][] arr = new int[triangle.length][triangle[triangle.length - 1].length];

        for (int i = triangle.length - 1; i >= 0; i--) {

            for (int j = 0; j < triangle[i].length; j++) {

                if (i == triangle.length - 1)
                    arr[i][j] = triangle[i][j];
                else {
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i + 1][j + 1]) + triangle[i][j];
                }
            }
        }

        return arr[0][0];
    }
}
