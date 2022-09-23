import java.util.Arrays;

public class MaximumProductSubarray {
	public static void main(String[]args)
	{
		int [] arr= {7,2,3,1,5,6};
	     Arrays.sort(arr);
	     int a=arr[0];
	     int c=0;
	    
		for(int i=0;i<arr.length;i++)
		{ c=0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j])==a)
				{
					c++;
				}
				
			}
			if(c==0)
			{
				System.out.println(a);
			}
		
			a++;
		}
	}
	

}
