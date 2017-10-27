package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("하나의 숫자를 입력하세요 => ");
			int score = Integer.parseInt(in.readLine());
			if(score<0) {
				throw new UserException1("점수가 너무 작음 ");
			}
			else if(score>100) {
				throw new UserException2("점수가 너무 큼 ");
			}
			System.out.println("정상적인 점수 입력");
		}
		catch(UserException1 e) {
			System.out.println("UserException1 처리 루틴 : ");
			System.out.println(e + "발생");
		}
		catch(UserException2 e) {
			System.out.println("UserException2 처리 루틴 : ");
			System.out.println(e + "발생");
		}
		catch(Exception e) {
			System.out.println("모든 예외 처리 루틴 : ");
			System.out.println(e + "발생");
		}
	}

}

class UserException1 extends Exception
{
	public UserException1(String message) {
		super(message);
	}
}

class UserException2 extends Exception
{
	public UserException2(String message) {
		super(message);
	}
}
