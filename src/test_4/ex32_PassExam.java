package test_4;

class Solution2 {

	public int func_a(int passed, int non_passed) {
		if (passed > 1 && non_passed == 0) // 통과한 종목이 하나보다 많고, 통과 점수의 반을 넘기지 못한 종목이 없을 때
			return 1;
		return 0;
	}

	public int func_b(int[] scores) { // 통과점수의 반을 넘기지 못한 종목 세기
		int answer = 0;
		if (scores[0] < 40) {
			answer++;
		}
		if (scores[1] < 44) {
			answer++;
		}
		if (scores[2] < 35) {
			answer++;
		}
		return answer;
	}

	public int func_c(int[] scores) { // 통과한 종목 몇 개인지 세기
		int answer = 0;
		
		if (scores[0] >= 80) {
			answer++;
		}
		if (scores[1] >= 88) {
			answer++;
		}
		if (scores[2] >= 70) {
			answer++;
		}
		return answer;
	}

	public int solution(int[][] scores) {
		int answer = 0;
		
		 for(int i = 0; i<scores.length; i++) { 
			 int passed = func_c(scores[i]);
			 int nonPassed = func_b(scores[i]);
			 answer += func_a(passed, nonPassed);
		}
		 
		return answer;
	}

}

public class ex32_PassExam {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[][] scores1 = { { 30, 40, 100 }, { 97, 88, 95 } };
		int ret1 = sol.solution(scores1);
		
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[][] scores2 = { { 90, 88, 70 }, { 85, 90, 90 }, { 100, 100, 70 }, { 30, 90, 80 }, { 40, 10, 20 },
				{ 83, 88, 80 } };
		int ret2 = sol.solution(scores2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
