package org.example;

public class FoodFight {

    public String solution(int[] food) {

        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {

            for(int j = 0; j < food[i] / 2; j++) {

                answer = answer + i;
                answer = i + answer;
                System.out.println(answer);
            }
        }

        return answer;
    }

}
