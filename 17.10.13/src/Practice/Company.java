package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String[] args) {
		String result = ""; //��� ���ڿ�
		Employee emp = null; // Employee ��ü�� ���۷��� ����
		Manager mng = null; //Manager ��ü�� ���۷��� ����
		String empNo = null;
		String name = null;
		String part = null;
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("��� �Է� ex)A1010 : ");
			empNo = in.readLine();
			System.out.println("�̸� �Է� ex)������ : ");
			name = in.readLine();
			System.out.println("�μ� �Է� ex)��ȹ : ");
			part = in.readLine();
			System.out.println("��å �Է� ex)��� -1,�븮-2,����-3 :");
			position = in.readLine();
		}catch(Exception e) {
			System.out.println("�Է� ����");
		}
	//position�� ���� "1"�̸� ���, �� ���̸� ������
		if(position.equals("1")) {//���
			//Employee Ŭ������ ��ü  emp�� ����
			emp = new Employee(empNo,name,part);
			result += emp.resultSTr();
		}
		else {//������ - position�� ���� "2"�̸� �븮��, �� ���̸� �������� ��ġ
			position = (position.equals("2"))?"�븮":"����";
			//Manager Ŭ������ ��ü  mng�� ����
			mng = new Manager(empNo,name,part,position);
			result += mng.resultSTr() + mng.addStr();
		}
		//��� ���ڿ��� �ֿܼ� ���
		System.out.println(result);		
	}
}