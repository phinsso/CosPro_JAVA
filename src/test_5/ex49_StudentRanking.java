package test_5;

import java.util.*;

class Solution9 {
    public int[] solution(int[] score) {
        int[] answer = new int[score.length];
        
        
        for(int i = 0; i < score.length; i++) {
        	answer[i] = 1;
        	
        	for(int j = 0; j < score.length; j++) {
        		if(score[i] < score[j]) answer[i]++;
        	}
        }
        
        return answer;
    }
}

public class ex49_StudentRanking {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] score1 = {90, 87, 87, 23, 35, 28, 12, 46};
        int[] ret1 = sol.solution(score1);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

        int[] score2 = {10, 20, 20, 30};
        int[] ret2 = sol.solution(score2);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
    }
}
