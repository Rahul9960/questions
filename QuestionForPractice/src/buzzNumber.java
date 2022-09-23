import java.util.Scanner;

public class buzzNumber {

	static boolean checkNumber(int number)
	{
		if(number%10==7||number%7==0)
		{
			return true;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args)
	{
		int  n1,n2;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("input first number");
		n1=sc.nextInt();
		System.out.println("input the second number");
		n2=sc.nextInt();
	}
		if(checkNumber(n1))
		{
			System.out.println("number is buzz");
			
		}
		else {
			System.out.println("number is not a buzz");
		}
		if(checkNumber(n2))
		{
			System.out.println("is a buzz number");
		}
		else {
			System.out.println("is not a buzz number");
		}
	}
}
