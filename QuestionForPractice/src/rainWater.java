
public class rainWater {
public static void main(String[]args)

//this programe is use to when we solve the programme on the water taping 
{
	int []a= {1,2,4,8,0,6,5,4,3};
	int n=a.length;
	int left[]=new int [n];
	int right[]=new int [n];
	left[0]=a[0];//here we trasferring the array a[] to the empty array left[] from bigening side 
	for (int i=1;i<n;i++)
	{
		left[i]=Math.max(left[i-1],a [i]);
	}
	right[n-1]=a[n-1];//here we trasferring the array a[] to the empty array left[] from end side 
	for(int i=n-2;i>=0;i--)
	{
		right[i]=Math.max(right[i+1], a[i]);
	}
	int ans=0;
	for(int i=0;i<n;i++)
	{
		ans+=(Math.min(left[i], right[i])-a[i]);
	}
	System.out.println(ans);
}
}
