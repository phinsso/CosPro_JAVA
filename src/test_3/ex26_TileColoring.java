package test_3;

class Solution6 {
    public String solution6(int tileLength) {
        String answer = "";
        String com = "RRRGGB";
        if(tileLength % 6 == 1 || tileLength % 6 == 2 || tileLength % 6 == 4)
        	// 6으로 나눴을 때 나머지가 1, 2, 4이면 타일이 맞지 않음
            answer = "-1";
        else 
            for(int i = 0; i < tileLength; i++)
                answer += com.charAt(i % 6);
        return answer;
    }
}

public class ex26_TileColoring {

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int tileLength1 = 11;
        String ret1 = sol.solution6(tileLength1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int tileLength2 = 16;
        String ret2 = sol.solution6(tileLength2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
