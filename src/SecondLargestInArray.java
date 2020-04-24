
public class SecondLargestInArray {
	
	public static void main(String args[])
	{
		int[] numbers = {2,3,5,15,7,9};
		System.out.println("Second Largest number is: "+findSecondLargest(numbers));
	}
	
	static int findSecondLargest(int[] numbers)
	{
		int firstLargest=0;
		int secondLargest=0;
		
		if(numbers[0] > numbers[1])
		{
			firstLargest = numbers[0];
		}
		else
		{ 
			firstLargest = numbers[1];
		}
		
		for(int i=2; i <= numbers.length-1; i++)
		{
			if(numbers[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = numbers[i];	
			}
			else if(numbers[i] < firstLargest && numbers[i]>secondLargest )
			{
				secondLargest = numbers[i];
			}
		}
			
		return secondLargest;
	}
}
