package Example;

// interface 대입 실습

public class Ex6 {
	public static void main(String[] args) {
		Starcraft1 obj;          //interface 타입의 객체 참조 변수 선언
		obj = new Terran1();     //interface 타입의 객체 참조 변수에 Terran1 클래스의 객체를 할당
		obj.attack("마린");       //Terran1 클래스의 객체가 Starcraft1 인터페이스를 포함해야 사용 가능하다.
		obj = new Protoss1();
		obj.attack("드라군");
		obj = new Zerg1();
		obj.attack("히드라리스크");
	}
}

interface Starcraft1{
	void attack(String s);
}

class Terran1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Terran의 "+s+" Attack");
	}
}

class Protoss1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Protoss의 "+s+" Attack");
	}
}

class Zerg1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Zerg의 "+s+" Attack");
	}
}