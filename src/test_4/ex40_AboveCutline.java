package test_4;

import java.util.*;

class Solution10 {
	public int solution10(int[] scores, int cutline) {
		int answer = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= cutline)
				answer++;
		}
		
		return answer;
	}
}

public class ex40_AboveCutline {
	public static void main(String[] args) {
		Solution10 sol10 = new Solution10();
		int[] scores = { 80, 90, 55, 60, 59 };
		int cutline = 60;
		int ret = sol10.solution10(scores, cutline);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
