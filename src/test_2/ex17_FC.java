package test_2;

// 섭씨온도 -> 화씨온도, 화씨온도 -> 섭씨온도
class Solution7 {
	public int solution7(int value, String unit) {
		int converted = 0;
		
		if(unit.equals("C"))
			converted = (int) ((value * 1.8) + 32);
		else
			converted = (int) ((value - 32) / 1.8);
		
		return converted;
	}
}

public class ex17_FC {

	public static void main(String[] args) {
		Solution7 sol7 = new Solution7();
		int value = 527;
		String unit = "C";
		int ret = sol7.solution7(value, unit);
		
		System.out.println(ret);
		
	}

}
