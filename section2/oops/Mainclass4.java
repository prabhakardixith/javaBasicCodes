class Mainclass4
{
	static double v1;//global variable
	static double s1;
	public static void test(double z1)
	{
		System.out.println("this is test");
		System.out.println("v1 "+v1);
		System.out.println("s1 "+s1);

		int x1=10;//local variable
		System.out.println("x1 "+x1);
	}
	public static void main(String[] args) //method declaration
	{
		System.out.println("s1 "+s1);
		System.out.println("v1 "+v1);
		test(2.4);
		//method defination
	}
}