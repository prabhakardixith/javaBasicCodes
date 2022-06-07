class reverse
{
	public static void reverser(int num)
	{
		
		int rev=0;
		int rem=0;
		System.out.println("actual number : "+num);
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;

		}
		System.out.println("reversed number : "+rev);
		

		
	}
	public static void main(String[] args) 
	{
		reverser(132);
	}
}
