
public class SumOfAllDigits {

	public static void main(String[] args) {
		
		sumOfAllDigits(1230);
		sumOfAllDigits(444456);
	}
	
	static void sumOfAllDigits(int number)
	{
		String str = String.valueOf(number);
		int lastDigit = 0;
		int sum = 0;
		
		while (number != 0)
        {
			for(int i=0; i<=str.length()-1; i++)
			{
				lastDigit = number % 10;
				number = number / 10;
				
				sum += lastDigit;
			}
        }
		
		System.out.println("Sum of all digits is: "+sum);
	}

}
