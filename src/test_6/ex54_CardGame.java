package test_6;

import java.util.*;

class Solution4 {
	public int solution(String[][] cards) {
		int answer = 0;
		int[] count = new int[3];
		
		for(int i = 0; i < cards.length; i++) {
				if(cards[i][0].equals("black"))
					count[0]++;
				else if(cards[i][0].equals("blue"))
					count[1]++;
				else if(cards[i][0].equals("red"))
						count[2]++;
				
				answer += Integer.parseInt(cards[i][1]);
		}
		
		if(count[0] == 3 || count[1] == 3 || count[2] == 3)
			answer *= 3;
		else if(count[0] == 2 || count[1] == 2 || count[2] == 2)
			answer *= 2;
		
		return answer;
	}
}

public class ex54_CardGame {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[][] cards1 = { { new String("blue"), new String("2") }, { new String("red"), new String("5") },
				{ new String("black"), new String("3") } };
		int ret1 = sol.solution(cards1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[][] cards2 = { { new String("blue"), new String("2") }, { new String("blue"), new String("5") },
				{ new String("black"), new String("3") } };
		int ret2 = sol.solution(cards2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
