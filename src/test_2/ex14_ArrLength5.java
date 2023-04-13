package test_2;

// 단어들이 들어있는 배열에서 길이가 5 이상인 단어를 배열에 들어있는 순서대로 이어 붙이기

class Solution4 {
	public String solution4(String[] words) {
		String answer = "";
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() >= 5) {
				answer += words[i];
			}
		}
		
		if(answer.length() == 0) {
			answer = "empty";
		}
		
		return answer;
	}
}

public class ex14_ArrLength5 {

	public static void main(String[] args) {
		
		Solution4 sol4 = new Solution4();
		String[] words1 = {"my", "favorite", "color", "is", "violet"};
		String ret1 = sol4.solution4(words1);
		System.out.println(ret1);
		
		String[] words2 = {"yes", "i", "am"};
		String ret2 = sol4.solution4(words2);
		System.out.println(ret2);

	}

}
