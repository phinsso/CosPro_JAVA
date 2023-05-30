package test_4;

import java.util.*;

class Solution8 {
	public int solution8(int n, int[] votes) {
		int[] arr = new int[n + 1]; // 후보자의 번호를 인덱스로 사용하기 위해 +1을 함 (인덱스 0번은 사용 안 한다는 뜻)
		for (int i = 0; i < votes.length; i++) {
			arr[votes[i]]++;
		} 
		for (int i = 1; i < n + 1; i++)
			if (arr[i] > votes.length / 2)
				return i;
		return -1;
	}
}

public class ex38_MajorityCandidate {
	public static void main(String[] args) {
		Solution8 sol8 = new Solution8();
		int n1 = 3;
		int[] votes1 = { 1, 2, 1, 3, 1, 2, 1 };
		int ret1 = sol8.solution8(n1, votes1);

		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int n2 = 2;
		int[] votes2 = { 2, 1, 2, 1, 2, 2, 1 };
		int ret2 = sol8.solution8(n2, votes2);

		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
