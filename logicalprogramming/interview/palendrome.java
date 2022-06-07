class palendrome
{
	public static void palendromer(int num)
	{
		int rem=0;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;

		}
		if(rev == temp)
		{
			System.out.println("number is palendrome");
		}
		else{
			System.out.println("number is not palendrome");
		}
	}
	public static void main(String[] args) 
	{
		palendromer(121);
		palendromer(122);
	}
}