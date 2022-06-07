class ReverseString
{
	public static void test(String str,char c)
	{
		int count=0;
		for (int i=0;i<=str.length();i++ )
		 {
		 	if(str.charAt(i) == 'i')
		 		count++;
			
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		String s = "hello";
		test(s,'l');
	}
}