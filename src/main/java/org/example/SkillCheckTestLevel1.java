package org.example;

import java.util.*;

public class SkillCheckTestLevel1 {

    public int solution(String str) {

        int result;

        str = str.replace("one", "1");
        str = str.replace("two", "2");
        str = str.replace("three", "3");
        str = str.replace("four", "4");
        str = str.replace("five", "5");
        str = str.replace("six", "6");
        str = str.replace("seven", "7");
        str = str.replace("eight", "8");
        str = str.replace("nine", "9");
        str = str.replace("zero", "0");

        result = Integer.parseInt(str);


        return result;
    }

    public String solution2(String X, String Y) {

        ArrayList<Integer> arr = new ArrayList<>();
        String answer = "";
        int temp;

        for (int i = 0; i < X.length(); i++) {

            for (int j = 0; j < Y.length(); j++) {

                if (X.charAt(i) == Y.charAt(j)) {

                    arr.add(Character.getNumericValue(X.charAt(i)));
                    Y = Y.replaceFirst(Character.toString(X.charAt(i)), "");

                    break;
                }
            }
        }

        if (arr.isEmpty())
            return "-1";

        Collections.sort(arr);
        Collections.reverse(arr);

        for (int e : arr) {
            answer = answer + e;
        }

        temp = Integer.parseInt(answer);

        answer = Integer.toString(temp);

        return answer;
    }

    public int[] solution3(int n, int m) {

        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];

        return answer;
    }


    // 유클리드 호제법을 이용한 최대공약수 구하는 메소드
    public int gcd(int p, int q) {

        if (q == 0)
            return p;

        return gcd(q, p & q);
    }

    // 끝 4자리를 제외한 문자를 "*"로 치환하는 메소드
    public String solution4(String phoneNumber) {

        String answer;
        StringBuilder sb = new StringBuilder(phoneNumber);

        for (int i = 0; i < sb.length() - 4; i++) {

            sb.setCharAt(i, '*');
        }

        answer = sb.toString();

        return answer;
    }

    public int solution5(int[] array) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i <= Arrays.stream(array).max().getAsInt(); i++)
            hashMap.put(i, 0);

        for (int e : array) {

            hashMap.put(e, hashMap.get(e) + 1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashMap.values());

        int max = Collections.max(arrayList);

        if (arrayList.indexOf(max) != arrayList.lastIndexOf(max))
            return -1;

        return arrayList.indexOf(max);
    }

}
