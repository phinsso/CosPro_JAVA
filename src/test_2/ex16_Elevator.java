package test_2;

// 엘리베이터가 멈춘 층이 순서대로 들어있는 배열이 주어질 때 엘리베이터의 총 이동거리

class Solution6 {
	public int solution6(int[] floors) {
		int dist = 0;
		int length = floors.length;
		
		for(int i = 1; i < length; ++i) {
			if(floors[i] > floors[i - 1])
				dist += floors[i] - floors[i - 1];
			else
				dist += floors[i - 1] - floors[i];
			
			/* dist += Math.abs(floors[i] - floors[i - 1]); // 뒤에서 앞의 것을 뺸 만큼을 절댓값으로 만들어서 더함 */
		}
		
		
		return dist;
	}
}

public class ex16_Elevator {

	public static void main(String[] args) {
		Solution6 sol6 = new Solution6();
		int[] floors = {1, 2, 5, 4, 2};
		int ret = sol6.solution6(floors);
		
		System.out.println(ret);

	}

}
