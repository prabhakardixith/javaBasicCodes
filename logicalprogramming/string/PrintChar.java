class PrintChar
{
	public static void test(String str)
	{
		for (int i=0;i<=str.length()-1;i++)
		{
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		String s = "hello";
		test(s);
	}
}