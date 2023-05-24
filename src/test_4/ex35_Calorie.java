package test_4;

import java.util.*;

class Solution5 {
	public int solution5(int[] calorie) {
		int minCal = 9999; // min에 최댓값 넣기
		int answer = 0;
		for (int i = 0; i < calorie.length; i++) {
			if (calorie[i] > minCal)
				answer += calorie[i] - minCal;
			else
				minCal = calorie[i];
		}
		return answer;
	}
}

public class ex35_Calorie {
	public static void main(String[] args) {
		Solution5 sol5 = new Solution5();
		int[] calorie = { 713, 665, 873, 500, 751 };
		int ret = sol5.solution5(calorie);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
