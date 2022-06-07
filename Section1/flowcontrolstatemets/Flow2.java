class Flow2
{
	public static void test(int num)
	{
		System.out.println("input = "+num);
		if (num > 5)
		{
			System.out.println(num+" number is greater than 5");
		}
		else 
		{
			System.out.println(num+" number is lesserthan 5");
		}
	}
	public static void main(String[] args) 
	{

		test(9);

		test(3);
		
	}
}