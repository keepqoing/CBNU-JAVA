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
		
		System.out.println("===��ü ����ȯ�� �������̵��� �̿�");
		//���� Ŭ������ ������ ������ ���� Ŭ������ ��ü ����
		//���� Ŭ������ �߻� Ŭ������ ��쿡�� ���� Ŭ������ ��ü�� ���� �����ϴ�.
		Starcraft obj = new Terran();
		obj.attack();
		obj = new Protoss();
		obj.attack();
	    obj = new Zerg();
		obj.attack();
		//obj = new Starcraft();
		//�߻� Ŭ������ �ڽ��� �����ڸ� �̿��� ��ü�� ������ �� ����.
	}	
}

abstract class Starcraft{
	abstract void attack();
}

class Protoss extends Starcraft{
	@Override
	public void attack() {
		System.out.println("�����佺�� ����");
	}
}

class Zerg extends Starcraft{
	@Override
	public void attack() {
		System.out.println("������ ����");
	}
}

class Terran extends Starcraft{
	@Override
	public void attack() {
		System.out.println("�׶��� ����");
	}
}