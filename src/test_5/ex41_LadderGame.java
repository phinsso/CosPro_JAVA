package test_5;

class Solution {
	public int solution(int[][] ladders, int win) {
        int answer = 0;
        
        int[] player = { 1, 2, 3, 4, 5, 6 };
        
        for(int i = 0; i < ladders.length; i++) {
        	// ladders.length만큼 각 이차원 배열 행의 바꿔준다. (뒤집어준다)
            int temp = player[ladders[i][0]-1];
            player[ladders[i][0] - 1] = player[ladders[i][1] - 1];
            player[ladders[i][1] - 1] = temp;
        }
        
        answer = player[win-1]; // 인덱스는 0부터이기 때문에 -1
        
        return answer;
    }
}

public class ex41_LadderGame {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] ladders = { { 1, 2 }, { 3, 4 }, { 2, 3 }, { 4, 5 }, { 5, 6 } };
		int win = 3;
		int ret = sol.solution(ladders, win);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
