package test_1;

import java.util.Arrays;

//각 학생들에게 옷 사이즈를 입력받아서 shirtSize 배열에 저장한다 (1~100개 사이)
//사이즈별로 몇 개가 입력되었는지 알아내는 Solution 메소드를 완성한다.
//결과도 배열로 출력한다 (사이즈 순서대로 몇 개인지 출력)
class Solution {
	public int[] solution(String[] shirtSize) {
		
		int[] answer = new int[6];
		
		for(int i = 0; i < shirtSize.length; i++) {
			switch(shirtSize[i]) {
			case "XS":
				answer[0]++; break;
			case "S":
				answer[1]++; break;
			case "M":
				answer[2]++; break;
			case "L":
				answer[3]++; break;
			case "XL":
				answer[4]++; break;
			case "XXL":
				answer[5]++; break;
			}
		}
		
		return answer;
	}
}

public class ex1_shirtsize {

	public static void main(String[] args) {
		String[] shirtSize = {"XS", "S", "L", "L", "XL","S"};
		Solution sol = new Solution();
		int[] ret = sol.solution(shirtSize); //매개변수를 가지고 메소드로 가서 수행하고 리턴값을 ret 배열에 저장해라
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret)); // ret이 정수형이니까 스트링으로 바꿔라

	}

}
