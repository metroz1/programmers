package org.example;

public class Painting {

    public int solution(int n, int m, int[] section) {

        int result = 1;
        int temp = section[0];
        for (int j : section) {

            if (j - temp >= m) {
                result++;
                temp = j;
            }
        }

        return result;
    }
}
