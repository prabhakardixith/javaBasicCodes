class Flow7
{
	public static void whole(double n)
	{
		if(n%1==0)
		{
			System.out.print("whole number "+n);
		}
		else
		{
			System.out.println("not whole number "+n);
		}
	}
	public static void main(String[] args) {
		
		whole(12.3);
	}
}