package Example;

// interface 상속 실습

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

//두 개의 인터페이스를 상속받는다.
//클래스의 상속은 한 개밖에 안 되지만
//인터페이스의 상속은 한 개 이상이 가능하다.
interface C3 extends C1,C2{
	void method4();
}

class C implements C3{
	public void method1() {
		System.out.println("Method1 구현");
	}
	
	public void method2() {
		System.out.println("Method2 구현");
	}
	
	public void method3() {
		System.out.println("Method3 구현");
	}
	
	public void method4() {
		System.out.println("Method4 구현");
	}
}