package test_1;

// 알파벳 문자열이 주어질 때, 연속하는 중복 문자를 삭제한 값을 반환하기

class Solution9 {
	public String solution9(String characters) {
		String result = "";
		result += characters.charAt(0);
		for(int i = 0; i < characters.length() - 1; i++) {
			if(characters.charAt(i) != characters.charAt(i + 1))
				result += characters.charAt(i + 1);
		}
		return result;
	}
}

public class ex9_Continuous {

	public static void main(String[] args) {
		Solution9 sol9 = new Solution9();
		String characters = "senteeeencccccceeee";
		String ret = sol9.solution9(characters);
		
		System.out.println(ret);

	}

}
