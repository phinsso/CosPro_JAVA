package test_1;

// 배열의 순서 뒤집기

import java.util.Arrays;

class Solution5 {
	public int[] solution5(int[] arr) {
		int left = 0; // 배열의 가장 왼쪽 인덱스
		int right = arr.length - 1; // 배열의 가장 오른쪽 인덱스
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return arr;
	}
}

public class ex5_BackArr {

	public static void main(String[] args) {
		Solution5 sol5 = new Solution5();
		int[] arr = {1, 4, 2, 3};
		int[] ret = sol5.solution5(arr);
		
		System.out.println(Arrays.toString(ret));

	}

}
