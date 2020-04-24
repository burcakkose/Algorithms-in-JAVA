import java.util.Arrays;

public class LargestNumberLessThanGivenNumber {

	public static void main(String[] args) {
		
		int[] arr = {145, 128, 139, 256};
//		int N = 145;
//		int D = 4;
//		int L = ?
			
		System.out.println(findLargestNumberLessThanGivenNumber(arr, 145, 4));
		System.out.println(getLessThan(123, 2));
	}
	
	static int findLargestNumberLessThanGivenNumber(int[] arr, int N, int D)
	{
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, N);
		int count=0;
		int resultNum = 0;
		int digitLength = 0;
		
		for(int i=index-1; i>=0; i--) {
			
			int searchNum = arr[i];
			
			while(searchNum != 0)
			{
				int remN = searchNum % 10;
				searchNum = searchNum / 10;
				digitLength++;
				
				if(remN != D)
				{
					resultNum = arr[i];
					count++;
				}
				else
				{
					break;
				}
			}
			
			if(count == digitLength)
			{break;}
		}
			return resultNum;
	
	}
	
	static int getLessThan(int N, int D)
	{
		//Converting digit to char
		char c = Integer.toString(D).charAt(0);
		
		//Decrementing number & checking whether it contains digit
		for(int i = N; i>0; i--)
		{
			//int a =Integer.toString(i).indexOf(c);
			
			if(Integer.toString(i).indexOf(c) == -1)
			{
				//If 'i' doesn't contain 'c'
				return i;
			}
		}
		
		return -1;
	}

}
