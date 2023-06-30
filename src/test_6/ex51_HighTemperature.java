package test_6;

class Solution {
	public int solution(int[] temperature, int A, int B) {
		int answer = 0;
		int max = temperature[A] > temperature[B] ? temperature[A] : temperature[B];
		
		for(int i = A; i < B; i++) {
			//if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
			if(temperature[i] > max)
				answer += 1;
		}
		return answer;
	}
}

public class ex51_HighTemperature {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] temperature = {3, 2, 1, 5, 4, 3, 3, 2};
		int A = 1;
		int B = 6;
		int ret = sol.solution(temperature, A, B);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
