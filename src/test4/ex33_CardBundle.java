package test4;

import java.util.Arrays;

class Solution3 {
	
	// A와 B가 번갈아가며 가져간 카드를 각각 배열에 넣기
	String func_a(String bundle, int start, int n) {
		String answer = "";
		for (int i = 0; i < n; i++)
			answer += bundle.charAt(start + i * 2); // 번갈아서 가져가야 하기 때문에 * 2
		return answer;
	}

	// 획득한 점수가 큰 사람과 획득한 점수를 순서대로 배열에 담음
	int[] func_b(int score1, int score2) {
		int[] answer = new int[2];
		if (score1 > score2) {
			answer[0] = 1;
			answer[1] = score1;
		} else if (score1 < score2) {
			answer[0] = 2;
			answer[1] = score2;
		} else {
			answer[0] = 0;
			answer[1] = score1;
		}
		return answer;
	}

	int func_c(String card) { // 각 점수 구하기
		int answer = 0;
		for (int i = 0; i < card.length(); i++) {
			answer += card.charAt(i) - 'a' + 1; // 'a'의 아스키코드 사용하여 계산
		}
		return answer;
	}

	int[] solution3(int n, String bundle) {
        String aCards = func_a(bundle, 0, n); // a카드의 시작 인덱스: 0
        String bCards = func_a(bundle, 1, n); // b카드의 시작 인덱스: 1
        int aScore = func_c(aCards);
        int bScore = func_c(bCards);
        int[] answer = func_b(aScore, bScore);
        return answer;
    }
}

public class ex33_CardBundle {
	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int n = 4;
		String bundle = new String("cacdbdedccbb");
		int[] ret = sol3.solution3(n, bundle);

		System.out.print("solution 메소드의 반환 값은 ");
		System.out.printf(Arrays.toString(ret));
		System.out.println(" 입니다.");
	}
}
