package org.example;

import java.util.HashMap;
import java.util.Map;

public class NearestWord {

    public int[] solution(String s) {

        char[] chars = s.toCharArray();
        int index = 0;

        int[] result = new int[s.length()];

        for (int i = 0; i < chars.length; i++) {

            index = -1;

            for (int j = i -1; j >= 0; j--) {

                if (chars[i] == chars[j]) {
                    index = i - j;
                    break;
                }

            }

            result[i] = index;
        }

        return result;
    }
}
