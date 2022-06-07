/*
class Test
{
	int num;
	public  void test()
	{
		System.out.println("hello");
		
	}
	public static void main(String[] args) 
	{ 
      Test t = new Test();
      t.test();
     
	}
}
*/
class Demo
{
	private static int a1=20;
	public static int getnum()
	{
		return a1;
	}
	
	public static void test()
	{
		System.out.println("tets()");
	}
}
class mainclass6
{
	
	public  static void add(int num2)
	{
			System.out.println("add()");


	}
	public static void main(String[] args)
	{
		System.out.println(Demo.getnum());
		
	}
}