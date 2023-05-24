package test_4;

class Solution4 {
	public int solution4(int[] classes, int m) {
        int answer = 0;
        for(int i = 0; i < classes.length; i++) {
            answer += classes[i] / m;
            if (classes[i] % m != 0)
                answer++;
        }
        return answer;
    }

}

public class ex34_TeachingAssistant {

	public static void main(String[] args) {
		Solution4 sol4 = new Solution4();
		int[] classes = { 80, 45, 33, 20 };
		int m = 30;
		int ret = sol4.solution4(classes, m);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
