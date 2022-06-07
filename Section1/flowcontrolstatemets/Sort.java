class Sort
{
	public static void sortnumber(int num)
	{
		int rem=0;
		for(int i=1;i<=num;i++)
		{
			rem=num/10;
			System.out.print("rem "+rem);
		}
	}
	public static void main(String[] args) {
		sortnumber(12);
	}
}