package org.example;

public class XRangeNumber {

    public long[] solution(int x, int n) {

        long[] result = new long[n];
        int count = 1;
        while (count <= n) {

            result[count - 1] = (long) x * count;
            count++;
        }

        return result;
    }

    public int solution(String str) {

        return Integer.parseInt(str);
    }
}
