package test_6;

import java.util.*;

class Solution3 {
	public int[] solution(int[] people) {
		int[] answer = new int[4];
		
		for(int i = 0; i < people.length; i++) {
			if(people[i] < 95) answer[0]++;
			else if(people[i] < 100) answer[1]++;
			else if(people[i] < 105) answer[2]++;
			else answer[3]++;
		}
		return answer;
	}
}

public class ex53_Uniform {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] people = { 97, 102, 93, 100, 107 };
		int[] ret = sol.solution(people);

		System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}
}
