package Example;

// ���� ���� interface ���� �ǽ�

public class Ex4 extends MultiInheritance {

	public static void main(String[] args) {
		MultiInheritance obj = new MultiInheritance();
		System.out.println("Inter1�� a = "+obj.a); // �̷��� ����  warning
		//The static field Inter1.a should be accessed in a static way
		System.out.println("Inter1�� a = "+MultiInheritance.a);
		System.out.println("Inter1�� a = "+a);
		System.out.println("Inter1�� b = "+b);
		obj.method1();
		obj.method2();

	}

}

interface Inter1{
	public int a = 100;
	public abstract void method1();
}

interface Inter2{
	public int b = 100;
	public abstract void method2();
}

class MultiInheritance implements Inter1,Inter2{
	public void method1() {
		System.out.println("Inter1�� �޼ҵ�");
	}
	
	public void method2() {
		System.out.println("Inter2�� �޼ҵ�");
	}
}