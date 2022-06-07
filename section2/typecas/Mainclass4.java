class Mainclass4
{
	public static void test(int v1)
	{
		System.out.println("this is test() int");
		System.out.println("v1 :"+v1);
	}
	public static void test(float v1)
	{
		System.out.println("this is test()");
		System.out.println("v1 :"+v1);
	}
	public static void main(String[] args) {

		int x1 = 10;
		test(x1);

		
	}
}