package org.example;

import java.util.ArrayList;
import java.util.List;

public class MakingHamburgers {

    public int solution(int[] ingredient) {

        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (int j : ingredient) {
            list.add(j);
        }

        for (int i = 0; i < list.size() - 3; i++) {

            if (list.get(i) == 1 && list.get(i + 1) == 2 && list.get(i + 2) == 3 && list.get(i + 3) == 1) {

                list.remove(i);
                list.remove(i);
                list.remove(i);
                list.remove(i);

                answer++;

                if (i > 2)
                    i = i - 4;
                else
                    i = -1;
            }
        }

        return answer;
    }
}
