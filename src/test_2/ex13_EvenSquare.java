package test_2;

// (서로 다른 두 자연수) N부터 M까지의 자연수 중, 짝수들의 제곱의 합을 구하기

class Solution3 {
	public int solution3(int N, int M) {
		int total = 0;
		int turn = M - N;
		
		for(int i = 0; i <= turn; i++) {
			if(N % 2 == 0) {
				System.out.println(N);
				total += N*N;
			}
			N++;
		}
		
		return total;
	}
}

public class ex13_EvenSquare {

	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int N = 4;
		int M = 7;
		int ret = sol3.solution3(N, M);
		System.out.println(ret);

	}

}
