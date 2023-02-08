package org.example;

import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {

            if (hashMap.containsKey(participant[i]))
                hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
            else
                hashMap.put(participant[i], 1);
        }

        for (int i = 0; i < completion.length; i++) {

            if (hashMap.containsKey(completion[i]))
                hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
            if (hashMap.get(completion[i]) == 0)
                hashMap.remove(completion[i]);
        }

        return hashMap.keySet().toString().replaceAll("[^a-z]", "");
    }
}
