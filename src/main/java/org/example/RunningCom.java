//package org.example;
//
//import java.util.*;
//
//public class RunningCom {
//
//    public String[] solution(String[] players, String[] callings) {
//
//        Map<String, Integer> nameMap = new HashMap<>();
//
//        String tempName;
//        int tempRank;
//        Map<Integer, String> rankMap = new TreeMap<>();
//
//        String[] answer = new String[players.length];
//
//        for (int i = 1; i <= players.length; i++) {
//            nameMap.put(players[i - 1], i);
//            rankMap.put(i, players[i - 1]);
//        }
//
//
//        for (String calling : callings) {
//
//            tempRank = nameMap.get(calling);
//            tempName = rankMap.get(tempRank - 1);
//d
//            nameMap.put(calling, nameMap.get(calling) - 1);
//            nameMap.put(tempName, nameMap.get(tempName) + 1);
//            rankMap.put(tempRank, tempName);
//            rankMap.put(tempRank - 1, calling);
//        }
//
//        return rankMap.values().toArray(new String[0]);
//    }
//}
