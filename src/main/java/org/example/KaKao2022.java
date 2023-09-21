package org.example;

import java.util.HashMap;
import java.util.Map;

public class KaKao2022 {

    public String solution(String[] survey, int[] choices) {

        Map<String, Integer> hashMap = new HashMap<>();
        String[] arr = {"RT", "CF", "JM", "AN"};
        StringBuilder result = new StringBuilder();

        hashMap.put("R", 0);
        hashMap.put("T", 0);
        hashMap.put("C", 0);
        hashMap.put("F", 0);
        hashMap.put("J", 0);
        hashMap.put("M", 0);
        hashMap.put("A", 0);
        hashMap.put("N", 0);

        for (int i = 0; i < survey.length; i++) {

            if(choices[i] < 4)
                hashMap.put(survey[i].split("")[0], hashMap.get(survey[i].split("")[0]) + (4 - choices[i]));
            else if (choices[i] > 4)
                hashMap.put(survey[i].split("")[1], hashMap.get(survey[i].split("")[1]) + Math.abs(4 - choices[i]));
        }

        for (int i = 0; i < arr.length; i++) {

            String[] splitStr = arr[i].split("");

            if (hashMap.get(splitStr[0]) < hashMap.get(splitStr[1]))
                result.append(splitStr[1]);
            else
                result.append(splitStr[0]);
        }

        return result.toString();
    }
}
