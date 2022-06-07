class Flow13
{



	public static void test(int num)
	{
		int count=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(count+" ");


			}
			count++;
			System.out.println();

		}
	}
	



	public static void main(String[] args) {
		test(3);
		
	}
}