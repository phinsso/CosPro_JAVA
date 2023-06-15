package test_5;

class Solution6 {
	public int solution(int korean, int english) {
		int answer = 0;

		int math = 210 - (korean + english);

		if (math > 100)
			answer = -1;
		else
			answer = math;

		return answer;
	}
}

public class ex46_MathScore {
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int korean = 70;
		int english = 60;
		int ret = sol.solution(korean, english);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
