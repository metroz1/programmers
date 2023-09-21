package org.example;

public class CharOfCenter {

    public String solution(String str) {

        int strLength = str.length();

        if (strLength % 2 == 0)
            return str.substring(strLength / 2 - 1, strLength / 2 + 1);
        else
            return str.substring(strLength / 2, strLength / 2 + 1);
    }
}
