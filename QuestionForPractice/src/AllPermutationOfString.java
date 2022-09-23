
public class AllPermutationOfString {
	public static void printPermutation(String str,String permutation)
	{
		if(str.length()==0)
		{
			System.out.println(permutation);
			return;
		}
		for (int i=0;i<str.length();i++)
		{
			//"abc"
			char currChar=str.charAt(i);                         //a              b     c         
			String newStr=str.substring(0,i)+str.substring(i+1); //a+bc         a+bc    ab+c
			printPermutation(newStr,permutation+currChar);       //abc , a      abc ab   abc abc 
			
		}                                                        
	}
	public static void main(String[] args)
	{
		String str="abc";
		printPermutation(str,"");
	}

}
