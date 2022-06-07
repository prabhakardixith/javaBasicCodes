class Flow18
{
	public static void test(int num)
	{
		int count=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print('*'+" ");
			}
			
			
			System.out.println(" ");

		}
	}
	



	public static void main(String[] args) {
		test(3);
		
	}
}