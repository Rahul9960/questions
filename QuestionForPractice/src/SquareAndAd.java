import java.util.ArrayList;

public class SquareAndAd {

	public static void main(String []args)
	{
		int n=19;
		int s=0;
		ArrayList<Integer>list=new ArrayList<Integer>();
	
				while(list.add(n))
				{
					s=s+(n%10)*n%10;
					n=n/10;
					if(s==1)
					{
						System.out.println("yes");
						break;
					}
					else {
						System.out.println("no");
						break;
					}
									
				}
			n=s;

	}
}
