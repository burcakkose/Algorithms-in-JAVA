import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		
		//Pattern-1
//		for(int i=noOfRows; i>=0; i--  ) {
//			
//			for(int j=1; j<=i; j++) {
//				
//				//Printing i spaces at the beginning of each row
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=rowCount; j++) {
//				
//				//Printing 
//				System.out.print(rowCount+" ");
//			}
//			
//			System.out.println();
//			rowCount++;
//		}
		
		
		//Pattern-2
		for(int i= noOfRows; i>=0; i--)
		{
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=rowCount; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
			rowCount++;
		}
		
	}

}
