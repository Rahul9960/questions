
public class SquareAndAdd {
	public void main(String[]args)
	{
		int num=15;
		int sum=0;
		while(num>0)
		{ sum=0;
			sum=sum+(num%10*num%10);
			num/=10;
			if(sum==1)
			{
				System.out.println("yes");
				break;
			}
			else {
				System.out.println("no");
				break;
			}
			
			
		}
		num=sum;
//		if(sum==1)
//		{
//			System.out.println("yes");
//			
//		}
//		else {
//			System.out.println("no");
//		}
	}
	
		
		 
}