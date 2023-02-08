package org.example;

import java.util.*;

public class ReceiveReportResult {

    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Set<String> stopAccount = new HashSet<>();

        for (int i = 0; i < report.length; i++) {

            String reporter = report[i].split(" ")[0];
            String target = report[i].split(" ")[1];

            if (reportMap.get(target) != null) {

                HashSet<String> reporterSet = reportMap.get(target);
                reporterSet.add(reporter);

                reportMap.put(target, reporterSet);
            }
            else {

                HashSet<String> reporterSet = new HashSet<>();
                reporterSet.add(reporter);

                reportMap.put(target, reporterSet);
            }

            if (reportMap.get(target).size() >= k)
                stopAccount.add(target);
        }
        List<String> idList = Arrays.asList(id_list);

        for (String target : stopAccount) {

            for (String reporter : reportMap.get(target)) {
                answer[idList.indexOf(reporter)] += 1;
            }
        }



        return answer;
    }

}
