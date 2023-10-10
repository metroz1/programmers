package org.example;

public class QuadCompression {

    private int one;
    private int zero;

    public int[] solution(int[][] arr) {

        calculate(arr, 0, 0, arr.length);

        return new int[]{zero, one};
    }

    private void calculate(int[][] arr, int row, int col, int length) {

        int val = arr[row][col];
        boolean match = true;

        for (int i = row; match && i < row + length; i++)
            for (int j = col; match && j < col + length; j++)
                match &= val == arr[i][j];

        if (match) {
            if (val == 0)
                zero++;
            else if (val == 1)
                one++;
        } else {
            length /= 2;

            calculate(arr, row, col, length);
            calculate(arr, row + length, col, length);
            calculate(arr, row, col + length, length);
            calculate(arr, row + length, col + length, length);
        }
    }
}
