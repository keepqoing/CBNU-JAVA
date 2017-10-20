package Example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// ���� ������ Company program����
// Super, Overrridng, ������ ������ Ÿ���� �߰�

public class Company {
	public static void main(String[] args) {
		String result = ""; //��� ���ڿ�
		Employee obj = null; // Employee ��ü�� ���۷��� ����
		//Manager mng = null; //Manager ��ü�� ���۷����� 
		                      //Employee ��ü�� ���۷��� ������ ���� ����
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
			obj = new Employee(empNo,name,part);
			result += obj.resultSTr();
		}
		else {//������ - position�� ���� "2"�̸� �븮��, �� ���̸� �������� ��ġ
			position = (position.equals("2"))?"�븮":"����";
			//Employee ��ü�� ���۷��� ������ Manager ��ü�� ���۷��� ���� ����.
			obj = new Manager(empNo,name,part,position);
			result += obj.resultSTr();
		}
		//��� ���ڿ��� �ֿܼ� ���
		System.out.println(result);		
	}
}

class Employee{
	private String empNo; //�����ȣ
	private String name;  //�̸�
	private String part;  //�μ�
	
	//�Ű����� ���� ������
	public Employee() {
	}
	
	//�Ű����� 3���� ���� ������
	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPart(String part) {
		this.part = part;
	}
	
	//��� �ʵ��� ���� ��� ���ڿ��� ����
	public String resultSTr() {
		String result = "";
		
		result += "��� : "+empNo+"\n";
		result += "�̸� : "+name+"\n";
		result += "�μ� : "+part+"\n";
		
		return result;	
	}
}

class Manager extends Employee{
	private String position; //��å
	
	//�Ű����� 4���� ���� ������
	public Manager(String empNo,String name,String part,String position) {
		//super�� ����� Employee Ŭ������ ������ ȣ�� ����
		super(empNo,name,part);
		this.position = position;
	}
	
	//�����ڿ��� �߰��Ǵ� ������ ��� ���ڿ��� ����
	//���� Ŭ���� Employee���� resultSTR()�� ������
	//���� Ŭ�������� �������̵� ����
	//���� Ŭ������ ���� �����ڰ� public�̹Ƿ�
	//���� Ŭ������ ���� �����ڴ� private or protected�� �� �� ����.
	public String resultSTr() {
		//���� Ŭ������ resultSTr()�� �����ϰ��� �� �� super ���
		String result = super.resultSTr();
		result += "��å : "+position+"\n";
		return result;
	}
}