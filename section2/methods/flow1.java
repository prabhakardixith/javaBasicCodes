class Flow1
{
	public static void test(int num)
	{
		System.out.println("input = "+num);

		if(num>5)
		{
			System.out.println("num is greaterthan 5");
		}
	}
	public static void main(String[] args)
	{
		test(10);

		test(4);
	}

}