package day13;

class Unit {
	int hp;
	int atk;
	String name;
	// 생성자를 작성하여 이름과 체력 공격력을 설정하면서 객체를 생성하세요

	// 2개의 유닛 객체를 생성하여 서로 공격을 주고 받을때 마다 이름과 체력을 출력하게 하세요

	// 2개의 유닛은 서로다른 체력과 공격력을 가지게 하고
	// 둘중 하나의 체력이 0이하가 되면 코드를 중단하게 하세요

	Unit(int hp, int atk, String name) {
		this.name = name;
		this.atk = atk;
		this.hp = hp;
	}

	void Atk(Unit target) {
		System.out.println(name + "가 " + target.name + "를 공격합니다.");
		target.hp -= this.atk;
	}

	void getState() { // 공격을 당한후
		System.out.println(name + "의 남의 체력은 :" + hp);
	}

	void Judge(Unit target) {
		if (target.hp < hp) {
			System.out.println(name+"이 이겼습니다.");
		}//if
		else {
			System.out.println(target.name+"가 이겼습니다.");
		}
	}//judge
}//unit
public class Ex05 {
	public static void main(String[] args) {
		Unit un1 = new Unit(100, 3, "전사");
		Unit un2 = new Unit(60, 5, "궁수");
		while (!(un1.hp <= 0 || un2.hp <= 0)) {
			un1.Atk(un2);
			un2.getState();
			if (un2.hp == 0)
				break;
			un2.Atk(un1);
			un1.getState();
		} // while
		un1.Judge(un2);
	}// main
}// class
