package test_2;

// 배열에 3의 배수와 5의 배수 중 어떤 수가 많은지 구하기

class Solution2 {
	public int func_a(int[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 5 == 0)
				count++;
		}
		//System.out.println("five: " + count);
		
		return count;
	}
	
	public String func_b(int three, int five) {
		
		if(three > five) return "three";
		else if(three < five) return "five";
		else return "same";
	}
	
	public int func_c(int[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0)
				count++;
		}
		
		//System.out.println("three: " + count);
		
		return count;
	}
	
	public String solution2(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		
		return answer;
	}
}

public class ex12_Multiple3or5 {

	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
		String ret = sol2.solution2(arr);
		
		System.out.println(ret);
	}

}
