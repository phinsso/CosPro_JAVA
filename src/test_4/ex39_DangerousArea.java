package test_4;

import java.util.*;

class Solution9 {
	public int solution9(int[][] height) {
		int count = 0;
		int[] dy = {-1, 1, 0, 0}; // 상하 항목들을 가져오기 위한 행 인덱스 증감값
		int[] dx = {0, 0, -1, 1}; // 좌우 항목들을 가져오기 위한 열 인덱스 증감값
		
		for(int i = 0; i < height.length; i++) {
			for(int j = 0; j < height.length; j++) {
				boolean isDanger = true;
				
				for(int k = 0; k < height.length; k++) {
					if(i + dy[k] >= 0 && i + dy[k] < 4 && j + dx[k] >= 0 && j + dx[k] < 4) { // 비교할 값이 행열 범위 안에 있는지
						if(height[i][j] >= height[i + dy[k]][j + dx[k]]) // 상하좌우에 있는 값이 비교 대상의 값보다 작으면 (= 위험지역이 아니면)
							/* [i][j]를 기준으로,
							 * [i - 1][j] => 상
							 * [i + 1][j] => 하
							 * [i][j - 1] => 좌
							 * [i][j + 1] => 우
							 */
							isDanger = false; // false로 변환 (위험지역이 아니라는 뜻)
					}
				}
				
				if(isDanger) count++;
			}
		}
		return count;
	}
}

public class ex39_DangerousArea {
	public static void main(String[] args) {
		Solution9 sol9 = new Solution9();
		int[][] height = { { 3, 6, 2, 8 }, { 7, 3, 4, 2 }, { 8, 6, 7, 3 }, { 5, 3, 2, 9 } };
		int ret = sol9.solution9(height);

		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
