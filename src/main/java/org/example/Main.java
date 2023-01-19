package org.example;

public class Main {
    public static void main(String[] args) {


//        int result = skillCheckTestLevel1.solution("one4seveneight");
//
//        System.out.println(skillCheckTestLevel1.solution2("100", "203045"));
//
//        int[] arr = {1, 2, 3, 3, 3, 4};
//
//        skillCheckTestLevel1.solution5(arr);


//        StringSplit stringSplit = new StringSplit();
//        String s = "banana";
//        System.out.println(stringSplit.solution(s));

//        SmallPartString smallPartString = new SmallPartString();
//        System.out.println(smallPartString.solution("3141592", "271"));

        HallOfFame hallOfFame = new HallOfFame();
        int[] scoreArray = {10, 100, 20, 150, 1, 100, 200};
        int[] arr = hallOfFame.solution(3, scoreArray);

        for(int score : arr) {
            System.out.print(score + " ");
        }
    }
}