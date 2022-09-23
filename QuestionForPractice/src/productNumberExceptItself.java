
public class productNumberExceptItself {
	@SuppressWarnings("null")
	public static void main(String[]args)
	{
		int [] num= {-1,1,0,-3,3};
		int product=1;
		int []nums = new int[5];
		for (int i=0;i<num.length;i++)
		{product=1;
			for (int j=0;j<num.length;j++)
			{
				if(num[i]!=num[j])
				{
					product *=num[j];
					nums[i]=product;
				}
			}
		}
		
		for(int j=0;j<nums.length;j++)
		{
			System.out.print(nums[j]+" ");
		}
	}

}
