package test_1;

// 자연수가 들어있는 배열의 평균을 구하고, 평균 이하인 숫자가 몇 개 있는지 구하기

class Solution10 {
	public int solution10(int[] data) {
		double total = 0;
		int len = data.length;
		
		for(int i = 0; i < len; i++) {
			total += data[i];
		}
		
		int cnt = 0;
		
		double avg = (double)total/len;
		
		for(int i = 0; i < len; i++) {
			if(data[i] <= avg)
				cnt++;
		}
		
		return cnt;
	}
}

public class ex10_BelowAverage {
	public static void main(String[] args) {
		Solution10 sol10 = new Solution10();
		int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int ret1 = sol10.solution10(data1);
		System.out.println(ret1);
		
		int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
		int ret2 = sol10.solution10(data2);
		System.out.println(ret2);
	}
}
