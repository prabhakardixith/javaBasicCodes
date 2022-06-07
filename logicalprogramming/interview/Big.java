// wap to find bigger digit 
class Big
{
	public static void bigger(int num)
	{
		int rem=0,big=0;;
		while(num>0)
		{
			rem=num%10;
			
			if(rem>big)
			{
				big=rem;
			}

			num=num/10;
		}
		System.out.println("bigger digit : "+big);
		
	}
	public static void main(String[] args) 
	{
		bigger(13259);
		
	}
}