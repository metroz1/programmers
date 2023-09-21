package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

//        HallOfFame hallOfFame = new HallOfFame();
//        int[] scoreArray = {10, 100, 20, 150, 1, 100, 200};
//        int[] arr = hallOfFame.solution(3, scoreArray);
//
//        for(int score : arr) {
//            System.out.print(score + " ");
//        }

//        WeaponOfKnight weaponOfKnight = new WeaponOfKnight();
//        System.out.println(weaponOfKnight.solution(5, 3, 2));

//        FruitSeller fruitSeller = new FruitSeller();
//        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
//        System.out.println(fruitSeller.solution(4, 3, score));

//        Babbling babbling = new Babbling();
//
//        String[] str = {"aya", "yee", "u", "maa", "wyeoo"};
//
//        System.out.println(babbling.solution(str));

//        SeesawPartner seesawPartner = new SeesawPartner();
//
//        int[] weights = {100, 180, 360, 100, 270};
//
//        System.out.println(seesawPartner.solution(weights));

//        PickTangerine pickTangerine = new PickTangerine();
//        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
//
//        System.out.println(pickTangerine.solution(6, tangerine));

//        NumberOfK numberOfK = new NumberOfK();
//        System.out.println(numberOfK.solution(1, 13, 1));

//        ChangeNumber changeNumber = new ChangeNumber();
//        System.out.println(changeNumber.solution(10, 40, 30));

//        LastBigNumber lastBigNumber = new LastBigNumber();
//        int[] numbers = {2, 3, 3, 5};
//        int[] numbers2 = lastBigNumber.solution(numbers);
//
//        for (int num : numbers2)
//            System.out.println(num);

//        FoodFight foodFight = new FoodFight();
//        int[] food = {1, 3, 4, 6};
//        System.out.println(foodFight.solution(food));

//        Babbling2 babbling2 = new Babbling2();
//        String[] strs = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
//        System.out.println(babbling2.solution(strs));

//        OurOwnCode ourOwnCode = new OurOwnCode();
//        System.out.println(ourOwnCode.solution("aukks", "wbqd", 5));

//        MakingHamburgers makingHamburgers = new MakingHamburgers();
//
//        int[] arr = {1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1};
//        int[] arr2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
//
//        System.out.println(makingHamburgers.solution(arr));

//        UnfinishedPlayer unfinishedPlayer = new UnfinishedPlayer();
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        System.out.println(unfinishedPlayer.solution(participant, completion));

//        String[] idList = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        ReceiveReportResult receiveReportResult = new ReceiveReportResult();
//
//        int[] answer = receiveReportResult.solution(idList, report, 2);
//
//        for (int num : answer)
//            System.out.print(num + " ");

//        String[] cards1 = {"i", "water", "drink"};
//        String[] cards2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
//        BundleOfCards bundleOfCards = new BundleOfCards();
//
//        System.out.println(bundleOfCards.solution(cards1, cards2, goal));

//        String p = "()))((()";
//        ParenthesesConversion parenthesesConversion = new ParenthesesConversion();
//
//        System.out.println(parenthesesConversion.solution(p));

//        RunningCom runningCom = new RunningCom();
//
//        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//        String[] callings = {"kai", "kai", "mine", "mine"};
//        String[] result = runningCom.solution(players, callings);
//
//        for (String str : result) {
//
//            System.out.println(str);
//        }

//        String[][] park = {
//                {"S", "O", "O"},
//                {"O", "O", "O"},
//                {"O", "O", "O"}};
//
//        String[] routes = {"E 2", "S 2", "W 1"};
//
//        int[] startIndex = new int[2];
//
//        for (int i = 0; i < park.length; i++) {
//            for (int j = 0; j < park[i].length; j++) {
//                if (park[i][j].equals("S")) {
//                    startIndex[0] = i;
//                    startIndex[1] = j;
//                }
//            }
//        }
//
//        for (int i = 0; i < routes.length; i++) {
//
//        }
//
//        String s = "abcdef";
//
//        CharOfCenter charOfCenter = new CharOfCenter();
//        System.out.println(charOfCenter.solution(s));

//        String str = "pPoooyY";
//
//        CheckString checkString = new CheckString();
//        System.out.println(checkString.solution(str));
//
//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//        int[] choices = {5, 3, 2, 7, 5};
//
//        KaKao2022 kaKao2022 = new KaKao2022();
//        System.out.println(kaKao2022.solution(survey, choices));

//        CoupleNumber coupleNumber = new CoupleNumber();
//        System.out.println(coupleNumber.solution("3403", "13203"));

//        Trio trio = new Trio();
//
//        int[] ints = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};
//        System.out.println(trio.solution(ints));
//
//        ColaProblem colaProblem = new ColaProblem();
//
//        System.out.println(colaProblem.solution(2, 1, 20));

//        NearestWord nearestWord = new NearestWord();
//
//        System.out.println(Arrays.toString(nearestWord.solution("banana")));

//        String[] keymap = {"BC", "CDB"};
//        String[] target = {"BB"};
//
//        RandomKeymap randomKeymap = new RandomKeymap();
//
//        int[] arr = randomKeymap.solution(keymap, target);
//
//        for (int n : arr) {
//            System.out.print(n + " ");

//        Painting painting = new Painting();
//        int[] arr = {1, 3};
//
//        System.out.println(painting.solution(5, 4, arr));

//        DesktopCleanUp desktopCleanUp = new DesktopCleanUp();
//
//        String[] strings = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        System.out.println(Arrays.toString(desktopCleanUp.solution(strings)));
//
//        WalkInThePark walkInThePark = new WalkInThePark();
//
//        String[] park = {"OSO","OOO","OOO","OOO"};
//        String[] routes = {"W 2"};
//
//        System.out.println(Arrays.toString(walkInThePark.solution(park, routes)));

//        MemoryScore memoryScore = new MemoryScore();
//        String[] name = {"may", "kein", "kain", "radi"};
//        int [] yearning = {5, 10, 1, 3};
//        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
//
//        System.out.println(Arrays.toString(memoryScore.solution(name, yearning, photo)));

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        RunningCom runningCom = new RunningCom();

        System.out.println(Arrays.toString(runningCom.solution(players, callings)));
    }

}
