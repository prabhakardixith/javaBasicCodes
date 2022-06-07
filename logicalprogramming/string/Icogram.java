class Icogram
{
	public static void test(String str)
	{
	for (int i=0;i<str.length() ;i++ )
		{
		 for (int j=i+1;j<str.length();j++) 
		 {
		 	if(str.charAt(i) == str.charAt(j))
		 	{
		 		System.out.println("is not a isogram");
		 		return;
		 	}
		 	
		 }
			
		}
		System.out.println("isogram");
	}
	public static void main(String[] args) {
		String str = "hello";
		test(str);
		test("abc");

	}
}