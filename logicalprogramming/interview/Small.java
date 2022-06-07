// wap to find smaller digit 
class Small
{
	public static void smaller(int num)
	{
		int rem=0;
		int small=1;
		while(num>0)
		{
			rem=num%10;
			
			if(rem < small)
			{
				small=rem;
			}

			num=num/10;
		}
		System.out.println("smaller number is : "+small);
		
	}
	public static void main(String[] args) 
	{
		smaller(913250);
		
	}
}