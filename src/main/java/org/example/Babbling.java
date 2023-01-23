package org.example;

public class Babbling {

    public int solution(String[] babbling) {

        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {

            babbling[i] = babbling[i].replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ");
            System.out.println(babbling[i]);

            if (babbling[i].isBlank())
                answer++;
        }

        return answer;
    }
}
