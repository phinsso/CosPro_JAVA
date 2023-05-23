package test_3;


class Solution9 {
    public int solution9(int day, int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) 
        	if(numbers[i] % 2 == day % 2) // 차량번호와 날짜가 둘 다 같은지(둘 다 홀수인지 짝수인지)
    			count++;
        return count;
    }
}

public class ex29_TwoVehicleSystem {
    public static void main(String[] args) {
        Solution9 sol9 = new Solution9();
        int day = 17;
        int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
        int ret = sol9.solution9(day, numbers);
    
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}