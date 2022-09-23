
public class PalindromeInString {
	public static String Pali(String str,int l,int r)
	{
		if(l>=r)
		{
			return " a palindrome";
		}
		if(l!=r)
		{
			return "not a palindrome";
			
		}
		return Pali(str,l+1,r-1);
	}
	public static void main(String[]args)
	{
		String str="madam";
		int l=str.length();
		int r=str.length();
		System.out.println(Pali(str,l,r));
	}

}
