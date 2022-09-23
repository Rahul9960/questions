
public class removeDuplicate {
	public static void main(String[]args)
	{
		StringBuilder a=new StringBuilder("aabb");
		a.append("c");
		a.append("c");
		
		for(int i=0;i<a.length();i++)
		{
			for (int j=i+1;j<a.length();j++)
			{
				if (a.charAt(i)==(a.charAt(j)))
				{
					a.delete(i,j);
				}
			}
		}
		System.out.println(a);
	}

	
	
}

