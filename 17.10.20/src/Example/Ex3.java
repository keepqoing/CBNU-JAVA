package Example;


// interface �ǽ�

public class Ex3 {

	public static void main(String[] args) {
		InterTest obj = new InterTest();
		//obj.a = 200; -> Error
		//Interface�� ������ �Ͻ������� final �����̴�.
		obj.method1();
		obj.method2();
		//Interface�� �޼ҵ�� �Ͻ������� abstract �޼ҵ��̴�.
		System.out.println("�������̽������� final�� ������� �ʾƵ� ������ final");
		System.out.println("�������̽������� abstract�� ������� �ʾƵ� �޼ҵ�� abstract");
	}

}

interface Inter{
	public int a = 100;
	public final int b = 100;
	public abstract void method1();
	public void method2();
}

class InterTest implements Inter{
	public void method1() {
		System.out.println("�߻� �޼ҵ�");
	}
	
	public void method2() {
		System.out.println("�߻� �޼ҵ�");
	}
}