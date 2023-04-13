package test_2;

// 자연수의 각 자릿수 중 소수가 몇 개인지 구하기

class Solution8 {
	public int solution8(int number) {
		int count = 0;
		while(number > 0) { // (number != 0 도 가능)
			int n =  number % 10;
			if(n == 2 || n == 3 || n == 5 || n == 7)
				count += 1;
			
			number /= 10;
		}
		
		return count;
	}
}


public class ex18_PrimeNumber {

	public static void main(String[] args) {
		Solution8 sol8 = new Solution8();
		int number = 29022531;
		int ret = sol8.solution8(number);
		
		System.out.println(ret);

	}

}

