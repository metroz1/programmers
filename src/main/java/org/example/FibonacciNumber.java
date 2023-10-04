package org.example;

public class FibonacciNumber {

    public int solution(int n) {

        int[] fibArr = new int[n + 1];

        fibArr[0] = 0;
        fibArr[1] = 1;
        fibArr[2] = 1;

        for (int i = 3; i < fibArr.length; i++) {

            fibArr[i] = (fibArr[i - 2] % 1234567) + (fibArr[i - 1] % 1234567);
        }

        return fibArr[n] % 1234567;
    }
}
