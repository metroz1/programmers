package org.example;


// 프로그래머스 명예의 전당 문제

import java.util.*;

public class HallOfFame {

    public int[] solution(int k, int[] scoreArray) {

        int[] answer = new int[scoreArray.length];

        ArrayList<Integer> fameList = new ArrayList<>();

        for (int i = 0; i < scoreArray.length; i++) {

            fameList.add(scoreArray[i]);

            if (fameList.size() > k)
                fameList.remove(Collections.min(fameList));

            answer[i] = Collections.min(fameList);
        }

        return answer;
    }
}