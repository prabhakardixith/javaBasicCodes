class ReverseString
{
	public static void test(String str)
	{
		for (int i=str.length()-1;i>=0;i-- )
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