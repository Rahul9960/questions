

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int [] arr= new int [] {5,2,8,3,9,7};
		int temp=0;
		
		//sorting the element 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//displaying the sorted element
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}