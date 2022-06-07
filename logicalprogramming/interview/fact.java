class fact
{
	public static int facter(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}

		return fact;
	}
	public static void main(String[] args) 
	{
		
		System.out.println("5 : "+"factorial of number is : "+facter(5));
		System.out.println("4 : "+"factorial of number is : "+facter(4));
	}
}