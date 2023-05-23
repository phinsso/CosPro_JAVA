package test_3;

class Solution7 {
	public int solution7(int numApple, int numCarrot, int k) {
		int answer = 0; // 주스의 수 (몇 잔인지의 값을 가지는 변수)

		if (numApple < 3 * numCarrot) // 사과가 당근의 3배가 되는지 (3:1의 비율을 충족하는지)
			answer = numApple / 3; // 사과가 부족한 경우 -> 사과를 3으로 나눈 것이 주스의 잔수가 됨
		else
			answer = numCarrot; // 사과가 부족하지 않은 경우 -> 사과가 부족하지 않으므로 당근이 있는 만큼 주스 잔수가 됨

		numApple -= 3 * answer;
		// 남은 사과의 개수 = 사과의 개수 - 3(주스 한 잔을 만들 때 필요한 개수) * answer(만들 수 있는 주스 잔수)
		numCarrot -= answer;
		// 남은 당근의 개수 = 당근의 개수 - answer(만들 수 있는 주스 잔수) <- 당근은 한 잔 당 하나만 들어가면 되기 때문!

		for (int i = 0; k - (numApple + numCarrot + i) > 0; i++)
			// 간식으로 줄 과일 개수 - (남은사과 + 남은 당근 + i) > 0
			if (i % 4 == 0) // for문의 조건식이 true일 경우 -> i % (주스 만들 때 필요한 개수 4개(사과3 + 당근1))의 값이 참이면(= 토끼에게 줄 것이 부족한 상황)
				answer--; // 주스의 잔을 한 잔 줄인다
		return answer; // for문의 조건식이 false일 경우 (토끼에게 줄만큼 간식이 남은 경우)
	}

}

public class ex27_Juice {
	
	public static void main(String[] args) {
		Solution7 sol7 = new Solution7();
		int numApple1 = 5;
		int numCarrot1 = 1;
		int k1 = 2;
		int ret1 = sol7.solution7(numApple1, numCarrot1, k1);
		
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int numApple2 = 10;
		int numCarrot2 = 5;
		int k2 = 4;
		int ret2 = sol7.solution7(numApple2, numCarrot2, k2);
		
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
