import java.util.Arrays;

public class CheckEqualityOfArrays {

	public static void main(String[] args) {

		String ar1[] = {"6","5","2"}; 
		String ar2[] = {"6","5","2"}; 

		//iterative method
		boolean equal = true;
		if(ar1.length == ar2.length)
		{
			for(int i=0; i<ar1.length; i++)
			{
				if(ar1[i] != ar2[i])
				{
					equal = false;
				}
			}
		}	
		else
		{
			equal = false;
		}

		if(equal)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}

		//using equal method
		System.out.println(Arrays.equals(ar1, ar2)); 

	}

}
