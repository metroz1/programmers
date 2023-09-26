package org.example;

public class LongJump {

    public long solution(int n) {

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;

        long[] ways = new long[n + 1];

        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n; i++) {

            ways[i] = (ways[i -2] % 1234567) + (ways[i - 1] % 1234567);
        }
        return ways[n] % 1234567;
    }
}
