package test_4;

import java.util.Arrays;

class Solution {
	public int[] solution(String[] schedule) {
		
        int xCount = 0;
        
        for(int i = 0; i < 10; i++) {
            if(schedule[i].charAt(0) == 'X')
                 xCount++;
        }

        int[] answer = new int[xCount];
        
        for(int i = 0, j = 0; i < 10; i++) {
            if(schedule[i].charAt(0) == 'X') {
            	answer[j++] = (i + 1);
            }
        }
        return answer;
    }
}


public class ex31_ConsultationSchedule {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] schedule = { "O", "X", "X", "O", "O", "O", "X", "O", "X", "X" };
		int[] ret = sol.solution(schedule);

		System.out.print("solution 메소드의 반환 값은 ");
		System.out.printf(Arrays.toString(ret));
		System.out.println(" 입니다.");
	}
}