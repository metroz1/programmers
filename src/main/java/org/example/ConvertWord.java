package org.example;

public class ConvertWord {

    private boolean[] isVisited;
    private int result;
    public int solution(String begin, String target, String[] words) {

        isVisited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return result;
    }

    private void dfs(String now, String target, String[] words, int count) {

        if (now.equals(target)) {
            result = count;
            return;
        }

        for (int i = 0; i < words.length; i++) {

            if (isVisited[i])
                continue;

            int differentWord = 0;

            for (int j = 0; j < now.length(); j++) {
                if (now.charAt(j) != words[i].charAt(j)) {
                    differentWord++;
                }
            }

            if (differentWord == 1) {
                isVisited[i] = true;
                dfs(words[i], target, words, count + 1);
                isVisited[i] = false;
            }
        }
    }
}
