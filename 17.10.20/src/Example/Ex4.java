package Example;

// 여러 개의 interface 포함 실습

public class Ex4 extends MultiInheritance {

	public static void main(String[] args) {
		MultiInheritance obj = new MultiInheritance();
		System.out.println("Inter1의 a = "+obj.a); // 이렇게 쓰면  warning
		//The static field Inter1.a should be accessed in a static way
		System.out.println("Inter1의 a = "+MultiInheritance.a);
		System.out.println("Inter1의 a = "+a);
		System.out.println("Inter1의 b = "+b);
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
		System.out.println("Inter1의 메소드");
	}
	
	public void method2() {
		System.out.println("Inter2의 메소드");
	}
}