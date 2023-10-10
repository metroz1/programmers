package org.example;

import java.util.Stack;

public class RemovePairing {

    public int solution(String s) {

        Stack<String> stack = new Stack<>();

        String[] words = s.split("");

        for (int i = words.length - 1; i >= 0; i--) {

            if (!stack.isEmpty() && stack.peek().equals(words[i]))
                stack.pop();
            else
                stack.push(words[i]);
        }

        if (stack.isEmpty())
            return 1;

        return 0;
    }
}
