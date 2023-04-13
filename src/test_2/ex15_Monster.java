package test_2;

// 몬스터를 잡기 위해 최소 몇 번 공격해야 하는지 구하기

class Solution5 {
	public int solution5(int attack, int recovery, int hp) {
		int count = 0;
		while(true) {
			count += 1;
			hp -= attack;
			if(hp <= 0)
				break;
			hp += recovery;
		}
		return count;
	}
}

public class ex15_Monster {

	public static void main(String[] args) {
		Solution5 sol5 = new Solution5();
		int attack = 30;
		int recovery = 10;
		int hp = 60;
		int ret = sol5.solution5(attack, recovery, hp);
		
		System.out.println(ret);

	}

}
