package test_4;

class Solution6 {
	public int solution6(int point) {
		if (point < 1000)
			return 0;
		return point / 100 * 100;
	}
}

public class ex36_Point {
	public static void main(String[] args) {
		Solution6 sol6 = new Solution6();
		int point = 2323;
		int ret = sol6.solution6(point);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
