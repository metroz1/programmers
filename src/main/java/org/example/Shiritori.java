package org.example;

import java.util.*;

public class Shiritori {

    public int[] solution(int n, String[] words) {

        int[] result = new int[2];

        int round = 1;
        Map<String, Integer> wordMap = new HashMap<>();

        Queue<String> queue = new LinkedList<>(Arrays.asList(words));

        String before = queue.remove();

        wordMap.put(before, wordMap.getOrDefault(before, 0) + 1);

        int index = 1;

        while (!queue.isEmpty()) {

            if (index == n) {
                index = 0;
                round++;
            }

            index++;

            String now = queue.remove();
            char lastWord = before.charAt(before.length() - 1);

            if (now.charAt(0) != lastWord || wordMap.containsKey(now)) {
                result[0] = index;
                result[1] = round;
                return result;
            }

            before = now;
            wordMap.put(before, wordMap.getOrDefault(before, 0) + 1);
        }

        return result;
    }
}
