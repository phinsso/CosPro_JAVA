package test_3;

import java.util.Arrays;

class Solution1 {
	public int[] solution1(int[] scores) {
		int[] rank = new int[scores.length];

		for(int i = 0; i < scores.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < rank.length; j++) {
				if(scores[i] < scores[j])
					rank[i]++;
			}
		}
		
		return rank;
	}
}

public class ex21_1_Score {

	public static void main(String[] args) {
		Solution1 sol1 = new Solution1();
		int[] scores = { 20, 60, 98, 59 };

		int[] ret = sol1.solution1(scores);
		System.out.println("점수: " + Arrays.toString(scores));
		System.out.println("석차: " + Arrays.toString(ret));

	}

}
