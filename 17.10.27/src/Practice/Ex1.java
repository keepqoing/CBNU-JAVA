package Practice;

public class Ex1 {
	static int a,b;
	public static void main(String[] args) {
		try {
			a = Integer.parseInt("12");
			b = Integer.parseInt("3");
			method1();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException ó�� ��ƾ");
			System.out.println(e + "���� �߻�");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException ó�� ��ƾ");
			System.out.println(e + "���� �߻�");
		}
	}
	
	public static void method1() throws NumberFormatException{
		System.out.println("�Ű������� �Է¹��� �� ���� ��");
		System.out.println("a = " + a + " b = " + b);
		System.out.println("================================");
		method2();
	}
	
	public static void method2() throws ArithmeticException{
		System.out.println("���� �޼ҵ� ���� �߻� ���� ���� ��");
		System.out.println("a�� b�� ���� �� = "+(a/b));
		System.out.println("���� �޼ҵ� ���� �߻� ���� ���� ��");
	}
}