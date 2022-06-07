interface Run1
{
	static final int z1 = 100;
	abstract public void test();

}
interface Run2 extends Run1
{
	static final int z1 = 100;
	abstract public void view();

}
class Sample implements Run2
{
	@Override
	public void test()
	{
		System.out.println("overriding test()");
	}
	@Override
	public void view()
	{
		System.out.println("overriding view()");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("program starts");

		Run Z1;
		System.out.println(Run.z1);

		Sample s1 = new Sample();
		s1.test();
		s1.view();

		System.out.println("program ends");


		
	}
}
