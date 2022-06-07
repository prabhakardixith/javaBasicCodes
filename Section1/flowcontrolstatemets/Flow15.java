class Flow15
{



	public static void test(int num)
	{
		char count='A';
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(count++ +" ");
				


			}
			
			System.out.println();

		}
	}
	



	public static void main(String[] args) {
		test(3);
		
	}
}