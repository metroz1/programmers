package org.example;

import java.util.*;

public class MineralDigging {

    public int solution(int[] picks, String[] minerals) {

        int result = 0;

        List<List<String>> mineralSection = new ArrayList<>();

        for (int i = 0; i < (minerals.length % 5 == 0 ? minerals.length / 5 : minerals.length / 5 + 1); i++)
            mineralSection.add(new ArrayList<>());

        for (int i = 0; i < mineralSection.size(); i++) {

            for (int j = i * 5; j < 5 + i * 5; j++) {

                if (j >= minerals.length)
                    break;

                mineralSection.get(i).add(minerals[j]);
            }
        }

        int totalPick = Arrays.stream(picks).sum();

        if (totalPick < mineralSection.size()) {

            for (int i = 0; i < mineralSection.size() - totalPick; i++)
                mineralSection.remove(mineralSection.size() - 1);
        }


        Collections.sort(mineralSection, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                int diamondCount1 = Collections.frequency(o1, "diamond");
                int diamondCount2 = Collections.frequency(o2, "diamond");

                int ironCount1 = Collections.frequency(o1, "iron");
                int ironCount2 = Collections.frequency(o2, "iron");

                if (diamondCount2 - diamondCount1 == 0) {
                    return ironCount2 - ironCount1;
                }
                return diamondCount2 - diamondCount1;
            }
        });


        for (int i = 0; i < picks[0]; i++) {

            if (mineralSection.isEmpty())
                break;

            for (int j = 0; j < mineralSection.get(0).size(); j++) {
                result++;
            }

            mineralSection.remove(0);
        }

        for (int i = 0; i < picks[1]; i++) {

            if (mineralSection.isEmpty())
                break;

            for (int j = 0; j < mineralSection.get(0).size(); j++) {

                if (mineralSection.get(0).get(j).equals("diamond"))
                    result += 5;
                else
                    result++;
            }

            mineralSection.remove(0);
        }

        for (int i = 0; i < picks[2]; i++) {

            if (mineralSection.isEmpty())
                break;

            for (int j = 0; j < mineralSection.get(0).size(); j++) {

                if (mineralSection.get(0).get(j).equals("diamond"))
                    result += 25;
                else if (mineralSection.get(0).get(j).equals("iron"))
                    result += 5;
                else
                    result++;
            }

            mineralSection.remove(0);
        }
        return result;
    }
}
