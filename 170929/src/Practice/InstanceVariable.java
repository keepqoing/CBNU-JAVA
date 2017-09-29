package Practice;

class Student{
	int m_nKor;
	int m_nEng;
	int m_nMat;
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.m_nEng = 40;
		obj.m_nMat = 50;
		System.out.println("obj의 국어점수 = "+obj.m_nKor);
		System.out.println("obj의 영어점수 = "+obj.m_nEng);
		System.out.println("obj의 수학점수 = "+obj.m_nMat);
	}

}
