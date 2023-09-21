package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CoupleNumber {

    public String solution(String X, String Y) {

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : X.toCharArray())
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : Y.toCharArray()) {

            if (countMap.containsKey(c) && countMap.get(c) > 0) {

                stringBuilder.append(c);
                countMap.put(c, countMap.get(c) - 1);
            }
        }

        String result = stringBuilder.toString();

        if (result.isEmpty())
            return "-1";

        if (result.matches("^0+$"))
            return "0";

        char[] digits = result.toCharArray();
        Arrays.sort(digits);

        return new StringBuilder(new String(digits)).reverse().toString();
    }
}
