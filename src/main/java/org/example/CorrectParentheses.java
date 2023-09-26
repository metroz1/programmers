package org.example;

public class CorrectParentheses {

    public boolean solution(String s) {

        int num = 0;

        for (char c : s.toCharArray()) {

            if (c == '(')
                num += 1;
            else if (c == ')')
                num -= 1;

            if (num < 0)
                return false;
        }

        return num == 0;
    }
}
