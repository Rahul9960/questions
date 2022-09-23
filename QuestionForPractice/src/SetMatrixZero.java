import java.util.Scanner;

public class SetMatrixZero {
	// this program is also for the traversal on string 
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	int number[][]=new int [4][4];
	int n=number.length;
	System.out.println("input all the element");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			number[i][j]=sc.nextInt();
		}
		
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(number[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
//			if(number [i][j]==1)
//			{
//				number[i][j]=0;
//			}
			if(i%2==1) {
				for(int k=n-1;k>=0;k--)
				{
					System.out.print(number[i][k]+" ");		
					
				}
				break;
			}
			else {
			System.out.print(number[i][j]+" ");
			}
		}
		System.out.println();

	}
	

}
}
