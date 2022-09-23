
public class WordSearch {
	public static void main(String[]args)
	{
		int arr[]= {6,5,4,3,2,1};
		int n=1;
	
		for(int i=0;i<n;i++)
		{
		int last;
		last=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[0]=last;
		}
		
		
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}