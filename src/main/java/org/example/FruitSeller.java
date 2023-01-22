package org.example;

import java.util.*;

public class FruitSeller {

    public int solution(int k, int m, int[] score) {

        int answer = 0;
        List<Integer> appleBox = new ArrayList<>();

        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {

            appleBox.add(score[i]);

            if (appleBox.size() == m) {

                answer += Collections.min(appleBox) * m;
                appleBox.clear();
            }

        }
        return answer;
    }
}
