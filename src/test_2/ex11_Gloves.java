package test_2;

// 제품 번호가 같은 왼손 장갑과 오른손 장갑을 합쳐 장갑 한 쌍을 만들 때, 최대 몇 개의 장갑 쌍을 만들 수 있는지 구하기

class Solution {
	final int max_product_number = 10;

	public int[] func_a(int[] arr) {
		int[] counter = new int[max_product_number + 1]; // 0 ~ 10

		for (int i = 0; i < arr.length; i++) {
			counter[arr[i]] += 1;
		}

		return counter;
	}

	public int solution(int[] left_gloves, int[] right_gloves) {
		int[] left_counter = func_a(left_gloves);
		int[] right_counter = func_a(right_gloves);
		int total = 0;

		for (int i = 1; i <= max_product_number; i++) {
			total += Math.min(left_counter[i], right_counter[i]);
		}
		return total;
	}
}

public class ex11_Gloves {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] leftGloves = { 2, 1, 2, 2, 4 };
		int[] rightGloves = { 1, 2, 2, 4, 4, 7 };
		int ret = sol.solution(leftGloves, rightGloves);

		System.out.println(ret);

	}

}
