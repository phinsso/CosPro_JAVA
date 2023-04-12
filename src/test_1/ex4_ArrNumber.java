package test_1;

// 배열에서 가장 많이 등장하는 숫자의 개수가 가장 적게 등장하는 숫자 개수의 몇 배인지 구하기

class Solution4 {
	int[] func_a(int[] arr) {
		int[] counter = new int[1001];
		for(int i = 0; i < arr.length; i++) {
			counter[arr[i]]++;
		}
		
		return counter;
	}
	
	int func_b(int[] arr) {
		int ret = 0;
		for(int i = 0; i < arr.length; i++) { //매개변수 arr == counter 배열 (즉, counter.length)
			if(ret < arr[i])
				ret = arr[i];
		}
		
		return ret;
	}
	
	int func_c(int[] arr) {
		final int INF = 1001;
		int ret = INF;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && ret > arr[i])
				ret = arr[i];
		}
		
		return ret;
	}
	
	public int solution4(int[] arr) {
		int[] counter = func_a(arr);
		int maxCnt = func_b(counter);
		int minCnt = func_c(counter);
		
		return maxCnt / minCnt;
	}
	
}

public class ex4_ArrNumber {

	public static void main(String[] args) {
		Solution4 sol4 = new Solution4();
		int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
		int ret = sol4.solution4(arr);
		
		System.out.println(ret);

	}

}

