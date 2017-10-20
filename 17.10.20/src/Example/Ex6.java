package Example;

// interface ���� �ǽ�

public class Ex6 {
	public static void main(String[] args) {
		Starcraft1 obj;          //interface Ÿ���� ��ü ���� ���� ����
		obj = new Terran1();     //interface Ÿ���� ��ü ���� ������ Terran1 Ŭ������ ��ü�� �Ҵ�
		obj.attack("����");       //Terran1 Ŭ������ ��ü�� Starcraft1 �������̽��� �����ؾ� ��� �����ϴ�.
		obj = new Protoss1();
		obj.attack("���");
		obj = new Zerg1();
		obj.attack("����󸮽�ũ");
	}
}

interface Starcraft1{
	void attack(String s);
}

class Terran1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Terran�� "+s+" Attack");
	}
}

class Protoss1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Protoss�� "+s+" Attack");
	}
}

class Zerg1 implements Starcraft1{
	public void attack(String s) {
		System.out.println("Zerg�� "+s+" Attack");
	}
}