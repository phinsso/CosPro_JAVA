package test_3;

import java.util.*;

class Solution3 {
	public int solution(int[] scores) {
		
		int answer = 0;
		
		Arrays.sort(scores);
		
		for(int i = 1; i < scores.length - 1; i++) {
			answer += scores[i];
		}
		
		answer /= (scores.length - 2);
		
		return answer;
	}

}


public class ex23_FinalScore {

	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int[] scores1 = { 35, 28, 98, 34, 20, 50, 85, 74, 71, 7 };
		int ret1 = sol3.solution(scores1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] scores2 = { 1, 1, 1, 1, 1 };
		int ret2 = sol3.solution(scores2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
