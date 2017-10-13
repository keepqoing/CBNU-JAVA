package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String[] args) {
		String result = ""; //결과 문자열
		Employee emp = null; // Employee 객체의 레퍼런스 변수
		Manager mng = null; //Manager 객체의 레퍼런스 변수
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
			emp = new Employee(empNo,name,part);
			result += emp.resultSTr();
		}
		else {//관리자 - position의 값이 "2"이면 대리로, 그 외이면 과장으로 대치
			position = (position.equals("2"))?"대리":"과장";
			//Manager 클래스의 객체  mng를 생성
			mng = new Manager(empNo,name,part,position);
			result += mng.resultSTr() + mng.addStr();
		}
		//결과 문자열을 콘솔에 출력
		System.out.println(result);		
	}
}