import java.util.Scanner;

public class ReverseUntilGetPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		String number;
		int result, counter = 0;
		boolean isPalindrome = false;
		
		number = sc.nextLine();
		int tempNumber = Integer.parseInt(number);
		sc.close();
		
		while(counter <= 10) {
				
			tempNumber = reverseAndSum(tempNumber);
			
			if(checkResultPalindrome(tempNumber)) {
				System.out.println("palindrome result is found: "+tempNumber);
				
			}
			else {
				counter++;
			}	
		}
		
	}
	
	static int reverseAndSum(int number) {
		
		int result,remainder, reverseResult=0, temp = 0;
		
		temp = number;
		
		while(temp > 0) {
			
			remainder = temp % 10;
			temp = temp / 10;
			reverseResult = (reverseResult*10)+remainder;
		}
		
		result = number + reverseResult;
		return result;
	}
	
	static boolean checkResultPalindrome(int result)
	{
		int remainder,reverseResult = 0;
		int tempNum = result;
		
		while(result > 0) {
			remainder = result % 10;
			result = result / 10;
			reverseResult = (reverseResult*10)+remainder;
		}
		
		if(tempNum == reverseResult)
		{return true;}
		else
		{return false;}
	}
}
