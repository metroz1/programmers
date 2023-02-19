package org.example;

public class ParenthesesConversion {

    public String solution(String p) {

        if (p.isBlank())
            return "";

        else if(isRightParenthesesString(p))
            return p;

        int count = 0;
        String u = "";
        String v = "";

        for (int i = 0; i < p.length(); i++) {

            if (p.charAt(i) == '(')
                count++;
            else
                count--;

            if (count == 0) {

                u = p.substring(0, i + 1);
                v = p.substring(i + 1, p.length());
                break;
            }
        }

        if (isRightParenthesesString(u))
            return u + solution(v);
        else {
            String temp = u.substring(1, u.length() - 1).replace("(", "1").replace(")", "(").replace("1", ")");
            return  "(" + solution(v) + ")" + temp;
        }

    }

    public boolean isRightParenthesesString(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')
                count++;
            else
                count--;

            if (count < 0)
                return false;

        }

        return true;
    }
}
