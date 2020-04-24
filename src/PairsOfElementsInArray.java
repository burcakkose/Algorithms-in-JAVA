
public class PairsOfElementsInArray {

	public static void main(String[] args) {
		
		int[] arr= {11,5,7,4,9,13,8,12};
		int sum = 20;
		
		for(int i=0; i<arr.length; i++)
		{
			//for(int j= arr.length-1; j>0; j--)
		    for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
			}
		}

	}

}
