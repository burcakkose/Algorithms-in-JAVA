import java.util.Arrays;

public class ReverseStrPreserveSpace_28 {

	public static void main(String[] args) {
		String str = "i am not a string";
		
		char[] charStr = str.toCharArray();
		char[] result = new char[charStr.length];
		
		
	    for(int i=0; i<charStr.length-1; i++)
	    {
	    	if(charStr[i] == ' ') {
	    		result[i] = ' ';
	    	}
	    }
	    
	    int j=result.length-1;
	    
	    for(int i=0; i<charStr.length; i++) {
    	
	    	if(charStr[i] != ' ') {
	    		
	    		if(result[j] == ' ')
	                {
	                    j--;
	                }
	    		
	    		result[j] = charStr[i];
	    		j--;
			}
	    
		}
	    
	    System.out.println(String.valueOf(result));
	}
	
	

}
