package test_3;

import java.util.*;

class Solution4 {
	public int solution(String[] words, String word) {
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (words[i].charAt(j) != word.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}

}

public class ex24_TypingErrorWord {
	public static void main(String[] args) {
		Solution4 sol4 = new Solution4();
		String[] words = { new String("CODE"), new String("COED"), new String("CDEO") };
		String word = new String("CODE");
		int ret = sol4.solution(words, word);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}