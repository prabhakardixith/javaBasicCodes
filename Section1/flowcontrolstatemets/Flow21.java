class Flow21
{
	public static void reverse(int n)
	{
		System.out.println("input "+n);
		if(n>0)
		{
			int rev=0;
			while(n!=0)
			{
				rev=(rev*10)+(n%10);
				//System.out.println("rev "+rev);
				n=n/10;
			}
			System.out.println(rev);

		}
		else
		{
			System.out.println("enter positive integer ");
		}
	}
	public static void main(String[] args) {
		reverse(1234);
	}
}