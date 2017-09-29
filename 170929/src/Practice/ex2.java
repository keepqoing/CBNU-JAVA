package Practice;

public class ex2 {
	public static void main(String args[]) {
		int[] coinUnit = {500,100,50,10};
		int money = 2320;
		int i;
		
		System.out.println("money = "+money);
		for(i=0;i<coinUnit.length;i++) {
			if(money == 0) break;
			System.out.println(coinUnit[i]+"¿ø = "+money/coinUnit[i]+"°³");
			money = money%coinUnit[i];
		}	
	}
}
