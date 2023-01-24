package org.example;

import java.util.*;

public class PickTangerine {

    public int solution(int k, int[] tangerine) {

        int boxedTangerine = 0;
        int answer = 0;

        Map<Integer, Integer> tangerineMap = new HashMap<>();

        for (int num : tangerine) {

            if (!tangerineMap.containsKey(num))
                tangerineMap.put(num, 1);
            else
                tangerineMap.put(num, tangerineMap.get(num) + 1);
        }

        List<Integer> tangerineValue = new ArrayList<>(tangerineMap.values());
        tangerineValue.sort(Integer::compareTo);

        for (int i = tangerineValue.size() - 1; i >= 0; i--) {

            boxedTangerine += tangerineValue.get(i);
            answer++;

            if (boxedTangerine >= k)
                break;;
        }

        return answer;
    }
}
