package test_1;

// 토익 시험 수강 대상자들의 인원수 구하기

class Solution7 {
	public int solution7(int[] scores) {
		
		int count = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 600 && scores[i] < 800) {
				count++;
			}
		}
		return count;
	}
}

public class ex7_toeic {

	public static void main(String[] args) {
		Solution7 sol7 = new Solution7();
		int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
		int ret = sol7.solution7(scores);
		System.out.println(ret);
	}

}

