class test
{
	public test()
	{
		System.out.println("test() with no arguments");
	}
		public test(int num)
	{
		System.out.println("test() with int num arguments");
	}
		public test(double num)
	{
		System.out.println("test() with double num arguments");
	}
		public test(int num,double nums)
	{
		System.out.println("test() with int and double arguments");
	}
		public test(double nums,int num)
	{
		System.out.println("test() with double and num arguments");
	}
	public static void main(String[] args) 
	{
		test();	
		test(12,3.4);
		test(3.4,12);
		test(100);

	}
}