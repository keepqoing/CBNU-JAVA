package Example;

//Abstract Class

public class Ex2 {
	public static void main(String args[]) {
		Terran marine = new Terran();
		marine.attack();
		Protoss dragoon = new Protoss();
		dragoon.attack();
		Zerg hydralisk = new Zerg();
		hydralisk.attack();
		
		System.out.println("===객체 형변환과 오버라이딩을 이용");
		//상위 클래스의 참조형 변수에 하위 클래스의 객체 대입
		//상위 클래스가 추상 클래스인 경우에도 하위 클래스의 객체가 대입 가능하다.
		Starcraft obj = new Terran();
		obj.attack();
		obj = new Protoss();
		obj.attack();
	    obj = new Zerg();
		obj.attack();
		//obj = new Starcraft();
		//추상 클래스는 자신의 생성자를 이용해 객체를 생성할 수 없다.
	}	
}

abstract class Starcraft{
	abstract void attack();
}

class Protoss extends Starcraft{
	@Override
	public void attack() {
		System.out.println("프로토스의 공격");
	}
}

class Zerg extends Starcraft{
	@Override
	public void attack() {
		System.out.println("저그의 공격");
	}
}

class Terran extends Starcraft{
	@Override
	public void attack() {
		System.out.println("테란의 공격");
	}
}