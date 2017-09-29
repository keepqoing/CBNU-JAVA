package Practice;

public class ex1 {
	public static void main(String[] args) {
		int[][] arr = {
				{5,6,7,8,9},
				{10,11,12,13,14},
				{21,23,25,27,29},
				{30,32,34,36,38}
		};
		
		int total = 0;
		int count=0;
		float average = 0;
		int i,j;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				total += arr[i][j];
				count++;
			}
		}
		average = total/(float)count;
		System.out.println("total = "+total);
		System.out.println("average = "+average);
	}
}
