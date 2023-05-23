package test_3;

class Solution10 {
	public int solution10(int[] arr) {
		int answer = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] % 2 == 0 && arr[i] / 2 == arr[j]) {
					answer++;
					break;
				}
			}
		
		return answer;
	}
}

public class ex30_DivideBy2 {
	public static void main(String[] args) {
		Solution10 sol10 = new Solution10();
		int[] arr = {4, 8, 3, 6, 7};
		int ret = sol10.solution10(arr);
		
		System.out.println("Solution 리턴 값은 " + ret);
	}
}
