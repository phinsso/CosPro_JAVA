package test_5;

class Solution2 {
    public int func_a(int[] timeTable) { // timeTable의 뒤부터 앞으로 가면서 값이 1인 인덱스 위치 반환
        int answer = 0;
        for(int i = timeTable.length-1; i >= 0; i--) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int func_b(int[] timeTable, int class1, int class2) {
        int answer = 0;
        for(int i = class1; i < class2; i++)
            if(timeTable[i] == 0)
                answer++;
        return answer;
    }

    public int func_c(int[] timeTable) {
        int answer = 0;
        for(int i = 0; i < timeTable.length; i++) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution(int[] timeTable) {
        int answer = 0;
        int firstClass = func_c(timeTable);
        int lastClass = func_a(timeTable);
        answer = func_b(timeTable, firstClass, lastClass);
        return answer;
    }
}

public class ex42_classAbsence {
    public static void main(String[] args) {
    	Solution2 sol = new Solution2();
    	int[] timeTable = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0};
    	int ret = sol.solution(timeTable);

    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
