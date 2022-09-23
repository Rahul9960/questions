
public class SpyNumber {
	static int num=123;
	static int product=1;
	static int sum=0;
	static int lastNumber;

	public static void main(String[] args)
	{
		while(num>0)
		{
			lastNumber=num%10;
			sum=sum+lastNumber;
			product=product*lastNumber;
			num=num/10;
			
			
		}
		if(sum==product)
		{
			System.out.println("This number is spy number");
			
		}
		else {
			System.out.println("this number is not spy number");
		}
		
		 
	}
}