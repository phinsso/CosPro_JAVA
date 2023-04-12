package test_1;

// 팰린드롬 (앞에서 읽을 때와 뒤에서 읽을 때가 똑같은 단어, 문장)인지 확인하기

class Solution8 {
	boolean solution8(String sentence) {
		String str = "";
		
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c != ' ' && c != '.' && c != ',')
				str += c;
		}
		
		int len = str.length();
		
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) // len - 1 = 13 (<= len - 1의 값) - i
				return false;
		}
		
		return true;
	}
}

public class ex8_palindrome {

	public static void main(String[] args) {
		Solution8 sol8 = new Solution8();
		String sentence = "never odd or even";
		boolean ret = sol8.solution8(sentence);
		System.out.println(ret);
		
		String sentence2 = "omg";
		boolean ret2 = sol8.solution8(sentence2);
		System.out.println(ret2);
		
	}

}

