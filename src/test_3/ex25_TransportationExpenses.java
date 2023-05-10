package test_3;

class Solution5 {
	public int solution5(int[] memberAge, String transportation) {
		int adultExpense = 0;
		int childExpense = 0;

		if(transportation.equals("Bus")) {
			adultExpense = 40000;
			childExpense = 15000;
		}
		else if(transportation.equals("Ship")) {
			adultExpense = 30000;
			childExpense = 13000;
		}
		else if(transportation.equals("Airplane")) {
			adultExpense = 70000;
			childExpense = 45000;
		}

		if(memberAge.length >= 10) {
			adultExpense = (int) (adultExpense * 0.9);
			childExpense = (int) (childExpense * 0.8);
		}

		int totalExpenses = 0;
		for(int i = 0; i < memberAge.length; i++) {
			if(memberAge[i] >= 20)
				totalExpenses += adultExpense;
			else
				totalExpenses += childExpense;
		}
	
		return totalExpenses;
	}
}

public class ex25_TransportationExpenses {
	
	public static void main(String[] args) {
		Solution5 sol5 = new Solution5();
		int[] memberAge1 = { 13, 33, 45, 11, 20 };
		String transportation1 = "Bus";
		int ret1 = sol5.solution5(memberAge1, transportation1);
		
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] memberAge2 = { 25, 11, 27, 56, 7, 19, 52, 31, 77, 8 };
		String transportation2 = "Ship";
		int ret2 = sol5.solution5(memberAge2, transportation2);
		
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}