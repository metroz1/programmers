package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberBlock {


    public int[] solution(long begin, long end) {

        int[] result = new int[(int) (end - begin) + 1];
        int startNum = (int) begin;

        for (int i = 0; i < end - begin + 1; i++) {

            if (startNum == 1)
                result[i] = 0;
            else if (isPrime(startNum))
                result[i] = 1;
            else result[i] = findMaxDivisor(startNum);


            startNum++;
        }

        return result;
    }
    private boolean isPrime(long n) {

        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {

            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    private int findMaxDivisor(int x) {

        if (x == 1) {
            return 0;
        }

        List<Integer> l = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                l.add(i);
                if (x / i <= 10_000_000) {
                    return x / i;
                }
            }

        }
        if (!l.isEmpty()) {
            return l.get(l.size() - 1);
        }

        return 1;
    }
}
