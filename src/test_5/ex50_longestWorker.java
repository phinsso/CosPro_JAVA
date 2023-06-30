package test_5;

class Solution10 {
    public int solution(int[] timeTable, int n) {
        int answer = 0;
        int[] arr = new int[n];
        
        // timeTable의 인덱스를 n으로 나눈 나머지 값이 인덱스인 arr 배열에 누적하면서 저장
        for(int i = 0; i < timeTable.length; i++) {
        	arr[i % n] += timeTable[i];
        }
        
        // 인원수 배열에서 누적시간 중 최댓값 구하기
        for(int i = 0; i < n; i++) {
        	answer = (answer > arr[i] ? answer : arr[i]);
        }

        return answer;
    }
}

public class ex50_longestWorker {

    public static void main(String[] args) {
    	Solution10 sol = new Solution10();
    	int[] timeTable1 = {1, 5, 1, 9};
    	int n1 = 3;
    	int ret1 = sol.solution(timeTable1, n1);

    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] timeTable2 = {4, 8, 2, 5, 4, 6, 7};
    	int n2 = 4;
    	int ret2 = sol.solution(timeTable2, n2);

    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
