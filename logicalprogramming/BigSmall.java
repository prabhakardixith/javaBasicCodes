class BigSmall
{
	public static void bigsmall(int num)
	{
		int rem=0,big=0,small=1;
		while(num>0)
		{
			rem=num%10;
			
			if(rem > big)
				big=rem;
			if(rem < small)
				small=rem;

			num=num/10;
		}
		System.out.println("big : "+big);
		System.out.println("small : "+small);
	}
	public static void main(String[] args) 
	{
		bigsmall(1394);
		
	}

}