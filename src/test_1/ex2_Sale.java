package test_1;

// 회원 등급에 따른 할인율을 적용한 가격 구하기

class Solution2 {
	public int solution2(int price, String grade) {
		
		int answer = 0;
		
		switch(grade) {
		case "S":
			answer = (int) (price * 0.95); break;
		case "G":
			answer = (int) (price * 0.90); break;
		case "V":
			answer = (int) (price * 0.85); break;
		}
		return answer;
	}
}


public class ex2_Sale {

	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int price1 = 2500;
		String grade1 = new String("V");
		int ret1 = sol2.solution2(price1, grade1);
		System.out.println(ret1);
		
		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol2.solution2(price2, grade2);
		System.out.println(ret2);
	}

}
