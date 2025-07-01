package org.example;

import java.util.ArrayList;
import java.util.List;

public class SheepAndWolf {

    private ArrayList<Integer>[] map;
    private int[] information;
    private int count;

    public int solution(int[] info, int[][] edges) {

        map = new ArrayList[info.length];
        information = info;

        for (int i = 0; i < edges.length; i++) {

            int parent = edges[i][0];
            int child = edges[i][1];

            if (map[parent] == null)
                map[parent] = new ArrayList<>();

            map[parent].add(child);
        }

        List<Integer> list = new ArrayList<>();
        list.add(0);

        countSheep(0, 0, 0, list);

        return count;
    }

    private void countSheep(int idx, int sheep, int wolf, List<Integer> next) {

        if (information[idx] == 0)
            sheep++;
        else
            wolf++;

        if (wolf >= sheep)
            return;

        count = Math.max(sheep, count);

        List<Integer> list = new ArrayList<>();

        list.addAll(next);
        list.remove(Integer.valueOf(idx));

        if (map[idx] != null) {
            for (int child : map[idx])
                list.add(child);
        }

        for (int nextNum : list) {
            countSheep(nextNum, sheep, wolf, list);
        }
    }

}
