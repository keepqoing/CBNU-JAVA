package Example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 지난 주차의 Company program에서
// Super, Overrridng, 참조형 데이터 타입을 추가

public class Company {
	public static void main(String[] args) {
		String result = ""; //결과 문자열
		Employee obj = null; // Employee 객체의 레퍼런스 변수
		//Manager mng = null; //Manager 객체의 레퍼런스는 
		                      //Employee 객체의 레퍼런스 변수에 대입 가능
		String empNo = null;
		String name = null;
		String part = null;
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("사번 입력 ex)A1010 : ");
			empNo = in.readLine();
			System.out.println("이름 입력 ex)명제석 : ");
			name = in.readLine();
			System.out.println("부서 입력 ex)기획 : ");
			part = in.readLine();
			System.out.println("직책 입력 ex)사원 -1,대리-2,과장-3 :");
			position = in.readLine();
		}catch(Exception e) {
			System.out.println("입력 오류");
		}
	//position의 값이 "1"이면 사원, 그 외이면 관리자
		if(position.equals("1")) {//사원
			//Employee 클래스의 객체  emp를 생성
			obj = new Employee(empNo,name,part);
			result += obj.resultSTr();
		}
		else {//관리자 - position의 값이 "2"이면 대리로, 그 외이면 과장으로 대치
			position = (position.equals("2"))?"대리":"과장";
			//Employee 객체의 레퍼런스 변수에 Manager 객체의 레퍼런스 대입 가능.
			obj = new Manager(empNo,name,part,position);
			result += obj.resultSTr();
		}
		//결과 문자열을 콘솔에 출력
		System.out.println(result);		
	}
}

class Employee{
	private String empNo; //사원번호
	private String name;  //이름
	private String part;  //부서
	
	//매개변수 없는 생성자
	public Employee() {
	}
	
	//매개변수 3개를 갖는 생성자
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
	
	//멤버 필드의 값을 결과 문자열로 결합
	public String resultSTr() {
		String result = "";
		
		result += "사번 : "+empNo+"\n";
		result += "이름 : "+name+"\n";
		result += "부서 : "+part+"\n";
		
		return result;	
	}
}

class Manager extends Employee{
	private String position; //직책
	
	//매개변수 4개를 간는 생성자
	public Manager(String empNo,String name,String part,String position) {
		//super를 사용해 Employee 클래스의 생성자 호출 가능
		super(empNo,name,part);
		this.position = position;
	}
	
	//관리자에서 추가되는 정보를 결과 문자열로 결합
	//상위 클래스 Employee에도 resultSTR()이 있지만
	//하위 클래스에서 오버라이딩 가능
	//상위 클래스의 접근 지정자가 public이므로
	//하위 클래스의 접근 지정자는 private or protected가 될 수 없다.
	public String resultSTr() {
		//상위 클래스의 resultSTr()에 접근하고자 할 때 super 사용
		String result = super.resultSTr();
		result += "직책 : "+position+"\n";
		return result;
	}
}