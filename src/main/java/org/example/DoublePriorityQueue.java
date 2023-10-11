package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

    public int[] solution(String[] operations) {

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (String str : operations) {

            String operation = str.split(" ")[0];
            int number = Integer.parseInt(str.split(" ")[1]);
            switch (operation) {
                case "I":
                    maxQueue.add(number);
                    minQueue.add(number);
                    break;
                case "D":
                    if (maxQueue.isEmpty())
                        break;
                    if (number == 1)
                        minQueue.remove(maxQueue.poll());
                    else
                        maxQueue.remove(minQueue.poll());
                    break;
            }
        }

        if (maxQueue.isEmpty() || minQueue.isEmpty())
            return new int[] {0, 0};

        else
            return new int[] {maxQueue.poll(), minQueue.poll()};
    }
}
