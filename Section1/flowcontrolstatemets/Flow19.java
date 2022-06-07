class Flow19
{
	public static void test(int num)
	{
		int count=1;
		for(int i=1;i<=num;i++)//outer loop i=rows
		{
			for(int j=num;j>=i;j--)// j=column
			{
				System.out.print(" ");//inner loop responsible for printing space 
			}
			for(int k=1;k<=i;k++)//inner loop responsible for *
			{
				System.out.print("*"+" ");

			}
			
			
			System.out.println(" ");

		}
	}
	



	public static void main(String[] args) {
		test(4);
		
	}
}