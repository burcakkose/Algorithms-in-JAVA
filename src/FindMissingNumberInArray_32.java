
public class FindMissingNumberInArray_32 {

	public static void main(String[] args) {
		
		int[] numbers={1,4,6,8,9,5,7,3}; // n=8 missing 2
		
		int n = (numbers.length)+1;
		int sumOfNumbers = 0;
		int sumOfElements = 0;
		
		sumOfNumbers = n*(n+1)/2;
		System.out.println(sumOfNumbers);
		
		for(int i=0; i<numbers.length; i++) {
			sumOfElements = sumOfElements + numbers[i];
		}
		
		System.out.println("Misssing element is "+(sumOfNumbers-sumOfElements));

	}

}
