package test_3;

class Solution8 {
	public int solution8(int[][] programs) {
		int answer = 0;
		int[] usedTv = new int[25]; // 0시 ~ 24시

		for (int i = 0; i < programs.length; i++) { // programs.length -> 행의 수 (3)
			for (int j = programs[i][0]; j < programs[i][1]; j++) { // 각 행의 시작시간 < 끝 시간인지를 비교하여
				usedTv[j]++; // 참일 경우 각 시간대에 ++
			}
		}

		for (int i = 0; i < 25; i++)
			if (usedTv[i] > 1) // 두 대 이상 튼 시간대인지
				answer++; // 참일 경우 answer++

		return answer;
	}
}

public class ex28_TVprogram {

	public static void main(String[] args) {
		Solution8 sol8 = new Solution8();
		int[][] programs = { { 1, 6 }, { 3, 5 }, { 2, 8 } };
		int ret = sol8.solution8(programs);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
