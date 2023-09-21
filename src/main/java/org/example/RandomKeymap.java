package org.example;

import java.util.HashMap;
import java.util.Map;

public class RandomKeymap {

    public int[] solution(String[] keymap, String[] target) {

        Map<Character, Integer> map = new HashMap<>();

        int[] resultArray = new int[target.length];
        int result;

        for (String s : keymap) {

            for (int j = s.length() - 1; j >= 0; j--) {

                if (map.getOrDefault(s.charAt(j), s.length()) > j)
                    map.put(s.charAt(j), j + 1);
            }
        }

        for (int i = 0; i < target.length; i++) {

            result = 0;

            for (int j = 0; j < target[i].length(); j++) {

                if (!map.containsKey(target[i].charAt(j))) {

                    result = -1;
                    break;
                }

                result += map.get(target[i].charAt(j));
            }

            resultArray[i] = result;
        }

        return resultArray;
    }
}
