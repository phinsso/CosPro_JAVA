package test_1;

// 369 게임 중 박수를 몇 번 치는지 구하기

class Solution6 {
	public int solution6(int number) {
		int count = 0;
		
		for(int i = 1; i <= number; i++) {
			int current = i; // 현재
			
			while(current != 0) {
				if(current % 10 == 3 || current % 10 == 6 || current % 10 == 9) { //일의 자리
					count++;
					System.out.println("pair");
				}
				current = current / 10; //십의 자리
			}
		}
		
		System.out.println();
		
		return count;
	}
}

public class ex6_369 {

	public static void main(String[] args) {
		Solution6 sol6 = new Solution6();
		int number = 40;
		int ret = sol6.solution6(number);
		
		System.out.println("Solution: return value if the mehtod is " + ret);

	}

}
