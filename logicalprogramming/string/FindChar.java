class FindChar
{
	public static void test(String str,char c)
	{
		int count=0;
		for (int i=0;i<=str.length()-1;i++ )
		 {
		 	if(str.charAt(i) == c)
		 		count++;
			
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		String s = "hellooo";
		test(s,'o');
	}
}