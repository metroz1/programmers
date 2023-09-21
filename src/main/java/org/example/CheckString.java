package org.example;

public class CheckString {

    public boolean solution(String str) {

        int pNum = str.length() - str.replaceAll("(?i)p", "").length();
        int yNum = str.length() - str.replaceAll("(?i)y", "").length();

        return pNum == yNum;
    }
}
