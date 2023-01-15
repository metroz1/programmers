package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KaKao2023 {

    // today = yyyy.mm.dd 형태, terms  = A 6, privacies = yyyy,mm,dd A 형태 데이터의 배열
    public int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> tempArr = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();

        int todayNum = Integer.parseInt(today.replace(".", ""));

        for (String s : terms) {

            termsMap.put(s.substring(0, 1), Integer.parseInt(s.substring(2)));
        }


        for (int i = 0; i < privacies.length; i++) {

            int expYear = Integer.parseInt(privacies[i].substring(0, 4));
            int expMonth = Integer.parseInt(privacies[i].substring(5, 7));
            int expDay = Integer.parseInt(privacies[i].substring(8, 10));

            String type = privacies[i].substring(11);


            expMonth = expMonth + termsMap.get(type);


            if (expMonth > 12) {
                expYear = expYear + ((expMonth - 1) / 12);

                if (expMonth % 12 == 0)
                    expMonth = 12;
                else
                    expMonth = expMonth % 12;
            }

            int expPeriod = (expYear * 10000) + (expMonth * 100) + expDay;

            if (todayNum - expPeriod >= 0)
                tempArr.add(i + 1);
        }

        return tempArr.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
