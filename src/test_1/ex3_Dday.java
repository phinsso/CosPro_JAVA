package test_1;

// 시작 날짜와 끝 날짜의 떨어져 있는 일수 구하기

class Solution3 {
	public int func_a(int month, int day) {
		int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int total = 0;
		for(int i = 1; i < month + 1; i++) {
			total += monthList[i];
		}
		total += day;
		
		return total - 1; // -1 : 1월 1일
	}
	
	public int solution3(int startMonth, int startDay, int endMonth, int endDay) {
		int startTotal = func_a(startMonth, startDay);
		int endTotal = func_a(endMonth, endDay);
		return endTotal - startTotal;
	}
}

public class ex3_Dday {

	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int startMonth = 1;
		int startDay = 2;
		int endMonth = 2;
		int endDay = 2;
		
		int ret = sol3.solution3(startMonth, startDay, endMonth, endDay);
		
		System.out.println("Solution: return value of the method is: " + ret);

	}

}
