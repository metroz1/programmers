package org.example;

public class NumberOfK {

    public int solution(int startNum, int endNum, int k) {

        int anwser = 0;

        for (int i = startNum; i <= endNum; i++) {
            String str = String.valueOf(i);

            anwser += str.length() - str.replaceAll(String.valueOf(k), "").length();
        }

        return anwser;
    }
}
