import java.util.Scanner;

public class CheckBinaryOrNot_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
//		String numbers = sc.nextLine();
		
		int numbers = sc.nextInt();
		int copyNumbers =numbers;
		sc.close();
		
//		int count=0;
		
		boolean isBinary = true;
		
//		char[] chBinary = numbers.toCharArray();
//		
//		for(char c: chBinary) {
//			if(c=='0' || c=='1')
//			{
//				count++;
//			}
//		}
//	
//		if(count == numbers.length())
//		{
//			System.out.println(numbers+" is binary");
//		}
//		else {
//			System.out.println(numbers+" is not binary");
//		}
		
		
		//other sol.
		while(copyNumbers != 0)
		{
			int temp = copyNumbers % 10;
			
			if(temp > 1)
			{
				isBinary = false;
				break;
			}
			else
			{
				copyNumbers = copyNumbers / 10;
			}
		}
		
		if(isBinary)
		{
			System.out.println(numbers+" is binary");
		}
		else
		{
			System.out.println(numbers+" is not binary");
		}
	}

}
