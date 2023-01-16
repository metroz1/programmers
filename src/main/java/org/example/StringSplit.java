package org.example;

public class StringSplit {

    public int solution(String s) {

        int answer = 0;
        int equalCount = 1;
        int differenceCount = 0;

        int count = 0;

        while (count < s.length()) {

            equalCount = 1;
            differenceCount = 0;

            for (int i = count + 1; i < s.length(); i++) {

                if (s.charAt(count) != s.charAt(i)) {
                    differenceCount++;

                }

                else {
                    equalCount++;
                }

                if (equalCount == differenceCount)
                    break;
            }

            count = count + equalCount + differenceCount;
            answer++;

        }
        return answer;
    }
}
