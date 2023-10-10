package org.example;

public class JadenCase {

    public String solution(String s) {

        String answer = "";

        String[] words = s.split(" (?=\\S)");

        for (int i = 0; i < words.length; i++) {

            if (Character.isDigit(words[i].charAt(0)))
                answer = answer + words[i].toLowerCase();
            else {
                answer = answer + Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
            }

            if (i < words.length - 1)
                answer = answer + " ";
        }

        return answer;
    }
}
