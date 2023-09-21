package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<>();
        int[] result = new int[photo.length];

        for (int i = 0; i < name.length; i++) {

            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {

            for (int j = 0; j < photo[i].length; j++) {

                result[i] += map.getOrDefault(photo[i][j], 0);
            }
        }

        return result;
    }
}
