package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OurOwnCode {

    public String solution(String s, String skip, int index) {

        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replaceAll(Character.toString(skip.charAt(i)), "");
        }


        for (int i = 0; i < s.length(); i++) {


            int shiftIndex = alphabet.indexOf(s.charAt(i)) + index;
            answer += alphabet.charAt(shiftIndex);
        }

        return answer;
    }
}
