class Flow11
{
	public static void smallnumber(int n)
	{
		int small=9,temp=0,rem=0;
		
			for(int i=1;n>0;i++)
			{
				
				rem=n%10;
				System.out.println("rem "+rem);
				n=n/10;
				System.out.println("n "+n);
				if(small>rem)
				{
					small=rem;
					System.out.println("small "+small);

				}

			}
			System.out.println("small "+small);
			
		
	}
	public static void main(String[] args)
	{
		smallnumber(3412);
	}
}