
public class MaxProfit {
	static int[] price= {7,1,5,3,6,4};
	static int  profit=0;
	static int  buyDay=2;
	static int sellDay=5;
	static int buyPrice=0;
	static int sellPrice=0;
	public static void main(String[] args) {
	
		if (buyDay<sellDay||buyDay==sellDay)
		{
			//buying the shares
			for (int i=0;i<buyDay;i++)
			{
				buyPrice=price[i];
			}
			//selling the shares
			for(int j=0;j<sellDay;j++)
			{
				sellPrice=price[j];
			}
			profit=sellPrice-buyPrice;
			if(profit<0)
			{
				profit=(-1)*profit;
				System.out.println(profit);
			}
			System.out.println(profit);
			
			
		}
		else {
			System.out.println("you are not allowed to do this");
		}
	}

}
