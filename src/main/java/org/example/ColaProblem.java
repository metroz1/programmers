package org.example;

public class ColaProblem {

    public int solution(int a, int b, int n) {


        int result = 0;
        int temp = 0;

        while (n >= a) {

            temp = n;

            n = (n / a) * b;
            result += n;

            if (temp > a)
                n += temp % a;
        }

        return result;
    }
}
