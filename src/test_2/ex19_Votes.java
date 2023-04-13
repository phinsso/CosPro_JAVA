package test_2;

// K표를 받은 후보가 몇 명인지 구하기

class Solution9 {
	public int solution9(int[] votes, int N, int K) {
		int[] counter = new int[N + 1];
		
		for(int i = 0; i < votes.length; i++) {
			/* switch(votes[i]) {
			case 1:
				counter[1]++; break;
			case 2:
				counter[2]++; break;
			case 3:
				counter[3]++; break;
			case 4:
				counter[4]++; break;
			case 5:
				counter[5]++; break;
			} */
			
			counter[votes[i]] += 1;
		}
		
		int answer = 0;
		
		for(int i = 1; i < counter.length; i++) {
			if(counter[i] == K) {
				answer += 1;
				System.out.println(i);
			}
			
		}
		
		return answer;
	}
}

public class ex19_Votes {

	public static void main(String[] args) {
		Solution9 sol9 = new Solution9();
		int[] votes = { 2, 5, 3, 4, 1, 5, 1, 5, 5, 3 };
		int N = 5;
		int K = 2;
		int ret = sol9.solution9(votes, N, K);

		System.out.println(ret);
	}
}

