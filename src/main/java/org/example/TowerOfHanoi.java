package org.example;

public class TowerOfHanoi {
    
    private int index;
    public int[][] solution(int n) {

        int[][] answer = new int[(int) (Math.pow(2, n) - 1)][2];
        
        hanoi(n, 1, 2, 3, answer);

        return answer;
    }

    private void hanoi(int n, int start, int layover, int end, int[][] answer) {

        if (n == 1)
            answer[index++] = new int[]{start, end};
        else {
            hanoi(n - 1, start, end, layover, answer);
            answer[index++] = new int[] {start, end};
            hanoi(n -1, layover, start, end, answer);
        }
    }
}
