package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SumOfSuccessiveSequences {

    public int[] solution(int[] sequence, int k) {

        int left = 0;
        int right = 0;
        int size = sequence.length;
        int sum = 0;
        int[] result = new int[2];

        for (right = 0; right < sequence.length; right++) {

            sum += sequence[right];

            while (sum > k) {
                sum -= sequence[left];
                left++;
            }

            if (sum == k) {

                if (size > right - left) {
                    size = right - left;
                    result[0] = left;
                    result[1] = right;
                }
                else if (size == right - left) {
                    result[0] = Math.min(result[0], left);
                    result[1] = Math.min(result[1], right);
                }
            }
        }

        return result;
    }
}
