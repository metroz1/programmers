package org.example;

import java.util.*;

public class SkillTestLevel2 {

    public String solution(int[] numbers) {

        Integer[] nums = Arrays.stream(numbers)
                        .boxed()
                                .toArray(Integer[]::new);
        Arrays.sort(nums, (o1, o2) -> {
            String str1 = o1.toString();
            String str2 = o2.toString();

            String concat1 = str1 + str2;
            String concat2 = str2 + str1;

            return concat2.compareTo(concat1);
        });
        String answer = "";
        for (int num : nums) {
            answer = answer + num;
        }

        if (answer.replace("0", "").isEmpty())
            return "0";

        return answer;
    }

    public int solution(int n, int k, int[] enemy) {

        if (enemy.length <= k)
            return enemy.length;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < enemy.length; i++) {

            queue.add(enemy[i]);

            if (queue.size() > k)
                n = n - queue.poll();

            if (n < 0)
                return i;
        }

        return enemy.length;
    }



}
