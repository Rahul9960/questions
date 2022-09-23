
public class OneStringToAnother {
	public static void main(String[]args)
	{
		String A="EACBD"; 
		String B="EABCD";
		int count=0;
		if(A.length()!=B.length())
		{
			System.out.println("please input correct string");
		}
		for(int i=0;i<A.length();i++)
		{
		
			for(int j=0;j<B.length();j++)
			{
				if(A.charAt(i)==B.charAt(j))
				{
					count++;
				}
			
			}
		}
		
		if(count==B.length())
		{
			while(A.equals(B))
			{
				char last;
			for (int i=A.length()-1;i>0;i--)
			{
				if(A.charAt(i)!=B.charAt(i))
				{
					
					last=A.charAt(i);
					
				// complete it first
				}
				
				
			}
			
			}
			
		}
	}

}
