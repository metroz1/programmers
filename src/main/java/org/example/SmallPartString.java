package org.example;

public class SmallPartString {

    public int solution(String t, String p) {

        int answer = 0;

        while (t.length() >= p.length()) {

            if (Long.parseLong(t.substring(0, p.length())) <= Long.parseLong(p))
                answer++;

            t = t.substring(1);
        }

        return answer;
    }
}
