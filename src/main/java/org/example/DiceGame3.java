package org.example;

import java.util.*;

public class DiceGame3 {

    public int solution(int a, int b, int c, int d) {

        Map<Integer, Integer> diceMap = new HashMap<>();

        diceMap.put(a, diceMap.getOrDefault(a, 0) + 1);
        diceMap.put(b, diceMap.getOrDefault(b, 0) + 1);
        diceMap.put(c, diceMap.getOrDefault(c, 0) + 1);
        diceMap.put(d, diceMap.getOrDefault(d, 0) + 1);

        List<Integer> list = new ArrayList<>(diceMap.keySet());

        if (diceMap.size() == 1)
            return a * 1111;

        if (diceMap.size() == 2) {

            if (diceMap.get(list.get(0)) == 1 || diceMap.get(list.get(1)) == 1) {

                int num1 = diceMap.get(list.get(0)) == 3 ? list.get(0) : list.get(1);
                int num2 = diceMap.get(list.get(0)) == 1 ? list.get(0) : list.get(1);

                return (int) Math.pow(num1 * 10 + num2, 2);
            }

            return ((list.get(0) + list.get(1)) * (Math.abs(list.get(0) - list.get(1))));
        }

        if (diceMap.size() == 3) {

            int result = 1;

            for (int i = 0; i < list.size(); i++) {

                if (diceMap.get(list.get(i)) != 2)
                    result *= list.get(i);
            }

            return result;
        }

        return Collections.min(list);
    }
}