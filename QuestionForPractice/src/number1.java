import java.util.ArrayList;
import java.util.HashSet;
	import java.util.Set;
public class number1 {
	
	    public static void main(String args[])
	    {
	        int n  = 19;
	        int sum = 0;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        while(list.add(n)){    
	            sum = 0;
	            while(n>0) {
	                sum=sum+ (n % 10)*(n % 10);
	                n =n/10;
	                break;
	            }
	            System.out.println(sum);
	           
	            n = sum;
	        }
	        if(sum == 1) {
	        	System.out.println(sum);
	        	//break;
	        }
	        }
}
	 
	      
