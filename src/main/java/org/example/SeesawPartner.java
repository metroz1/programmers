package org.example;

import java.util.*;

public class SeesawPartner {

    public long solution(int[] weights) {

        long answer = 0;

        Map<Integer, Integer> weightMap = new HashMap<>();

        Set<Integer> weightSet = new HashSet<>();

        for (int i = 0; i < weights.length; i++) {

            if (!weightMap.containsKey(weights[i])) {
                weightMap.put(weights[i], 1);
            }
            else {
                weightMap.put(weights[i], weightMap.get(weights[i]) + 1);
            }

            weightSet.add(weights[i]);
        }


        for (int key : weightSet) {

            int person = weightMap.get(key);

            int weightX2 = key * 2;

            if (weightX2 % 3 == 0) {
                if (weightMap.containsKey(weightX2 / 3))
                    answer += (long)weightMap.get(weightX2 / 3) * person;
            }

            if (weightX2 % 4 == 0) {
                if (weightMap.containsKey(weightX2 / 4))
                    answer += (long)weightMap.get(weightX2 / 4) * person;
            }

            int weightX3 = key * 3;

            if (weightX3 % 2 == 0) {
                if (weightMap.containsKey(weightX3 / 2))
                    answer += (long)weightMap.get(weightX3 / 2) * person;
            }

            if (weightX3 % 4 == 0) {
                if (weightMap.containsKey(weightX3 / 4))
                    answer += (long)weightMap.get(weightX3 / 4) * person;
            }

            int weightX4 = key * 4;

            if (weightX4 % 2 == 0) {
                if (weightMap.containsKey(weightX4 / 2))
                    answer += (long)weightMap.get(weightX4 / 2) * person;
            }

            if (weightX2 % 3 == 0) {
                if (weightMap.containsKey(weightX4 / 3))
                    answer += (long)weightMap.get(weightX4 / 3) * person;
            }

            if (person > 1) {
                answer += (long) person * (long) (person - 1) / 2;
            }

            weightMap.remove(key);
        }


        return answer;
    }
}
