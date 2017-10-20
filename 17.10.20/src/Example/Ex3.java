package Example;


// interface 실습

public class Ex3 {

	public static void main(String[] args) {
		InterTest obj = new InterTest();
		//obj.a = 200; -> Error
		//Interface의 변수는 암시적으로 final 변수이다.
		obj.method1();
		obj.method2();
		//Interface의 메소드는 암시적으로 abstract 메소드이다.
		System.out.println("인터페이스에서는 final을 사용하지 않아도 변수는 final");
		System.out.println("인터페이스에서는 abstract을 사용하지 않아도 메소드는 abstract");
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
		System.out.println("추상 메소드");
	}
	
	public void method2() {
		System.out.println("추상 메소드");
	}
}