package org.example;

public class Main {
    public static void main(String[] args) {

        KaKao2023 kaKao2023 = new KaKao2023();

//        int result = skillCheckTestLevel1.solution("one4seveneight");
//
//        System.out.println(skillCheckTestLevel1.solution2("100", "203045"));
//
//        int[] arr = {1, 2, 3, 3, 3, 4};
//
//        skillCheckTestLevel1.solution5(arr);

        String today = "2022.05.19";
        String[] terms = {"A 12"};
        String[] privacies = {"2019.12.1 A"};

        kaKao2023.solution(today, terms, privacies);
    }
}