package org.example;

import java.util.*;

public class ChangeNumber {

    public int solution(int x, int y, int n) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> tempSet = new HashSet<>();

        queue.add(x);

        while (!queue.isEmpty()) {

            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {

                if (queue.peek() == y)
                    return answer;
                checkNumber(queue.poll(), y, n, tempSet, queue);
            }
            answer++;
        }
        return -1;
    }

    public void checkNumber(int number, int y, int n, Set<Integer> hSet, Queue<Integer> queue) {

        if (number + n <= y && !hSet.contains(number + n)) {
            queue.add(number + n);
            hSet.add(number + n);
        }
        if (number * 2 <= y && !hSet.contains(number * 2)) {
            queue.add(number * 2);
            hSet.add(number * 2);
        }
        if (number * 3 <= y && !hSet.contains(number * 3)) {
            queue.add(number * 3);
            hSet.add(number * 3);
        }
    }
}
