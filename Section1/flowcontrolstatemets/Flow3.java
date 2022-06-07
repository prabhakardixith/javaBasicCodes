class Flow3
{
	public static void test(int num)
	{
		System.out.println("input = "+num);
		if (num > 15)
		{
			System.out.println(num+" is greaterthan 15");
		}
		else if (num < 15)
		{
			System.out.println(num+" is lesserthan 15");
		}
		else 
		{
			System.out.println(num+" is equal to 15");
		}
	}
	public static void main(String[] args) 
	{
		test(17);
		test(11);
		test(15);
		
	}
}