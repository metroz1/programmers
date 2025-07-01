package org.example;

public class ConvertCase {

    public String solution(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c > 96) {
                result += Character.toString(c).toUpperCase();
            } else {
                result += Character.toString(c).toLowerCase();
            }
        }

        return result;
    }
}
