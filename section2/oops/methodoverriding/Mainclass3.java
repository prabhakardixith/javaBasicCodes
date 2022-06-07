class Demo
{
	int v1 = 10;
	public void count()
	{
		System.out.println("this is count() of Demo class");
	}
}
class Sample extends Demo
{
	double v1 =13.87;

	@Override
	public void count()
	{
		System.out.println("this is Overrideen count() sample class");
	}
	public void test()
	{
		System.out.println("this is test() sample class");
		System.out.println("v1 : "+v1);
		System.out.println("v1 of super class : "+super.v1);

		count();

		super.count();
	}
}
class Mainclass3
{
	public static void main(String[] args) {
		System.out.println("program starts");
		Sample s = new Sample();
		
		s.test();
		System.out.println("program ends");
	}
}