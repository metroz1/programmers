package org.example;

public class Babbling2 {

    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {

            str = str.replaceAll("aya", "1").replaceAll("ye", "2")
                    .replaceAll("woo", "3").replaceAll("ma", "4");

            if (!isContinuous(str)) {
                str = str.replaceAll("[0-9]", "");
            }

            System.out.println(str);

            if (str.isBlank())
                answer++;
        }

        return answer;
    }

    public boolean isContinuous(String babbling) {

        for (int i = 0; i < babbling.length() - 1; i++) {

            if (babbling.charAt(i) == babbling.charAt(i + 1))
                return true;
        }
        return false;
    }
}
