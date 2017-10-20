package Example;

// interface ��� �ǽ�

public class Ex5 {

	public static void main(String[] args) {
		C obj = new C();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

}

interface C1{
	void method1();
	void method2();
}

interface C2{
	void method3();
}

//�� ���� �������̽��� ��ӹ޴´�.
//Ŭ������ ����� �� ���ۿ� �� ������
//�������̽��� ����� �� �� �̻��� �����ϴ�.
interface C3 extends C1,C2{
	void method4();
}

class C implements C3{
	public void method1() {
		System.out.println("Method1 ����");
	}
	
	public void method2() {
		System.out.println("Method2 ����");
	}
	
	public void method3() {
		System.out.println("Method3 ����");
	}
	
	public void method4() {
		System.out.println("Method4 ����");
	}
}