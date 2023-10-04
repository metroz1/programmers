package org.example;

import java.util.Collections;
import java.util.PriorityQueue;


public class MinimumValue {

    public int solution(int[] a, int[] b) {

        PriorityQueue<Integer> aQueue = new PriorityQueue<>();
        PriorityQueue<Integer> bQueue = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            aQueue.add(a[i]);
            bQueue.add(b[i]);
        }

        while (!aQueue.isEmpty()) {

            sum += aQueue.poll() * bQueue.poll();
        }

        return sum;
    }
}
