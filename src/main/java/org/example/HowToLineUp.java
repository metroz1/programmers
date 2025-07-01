//package org.example;
//
//public class HowToLineUp {
//
//    public int[] solution(int n, int k) {
//
//        int numOfCase = calculateFactorial(n);
//
//        int[] arr = new int[n];
//
//        arr[0] = 1;
//        arr[1] = 1;
//
//        for (int i = 2; i <= n; i++)
//            arr[i] = i * arr[i - 1];
//
//
//    }
//
//
//
//    private int calculateFactorial(int n) {
//
//        if (n == 0)
//            return 1;
//        else {
//            return n * calculateFactorial(n - 1);
//        }
//    }
//}
