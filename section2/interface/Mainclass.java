interface Run
{
	int z1 = 100;//by default final and static
	abstract public void test();

}
interface Run1
{
	
	default void hello()
	{
		System.out.println("hello() of runi");

	}
}
class Sample implements Run,Run1
{
	@Override
	public void test()
	{
		System.out.println("overriding test()");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts");

		Run Z1;
		System.out.println(Run.z1);

		Sample s1 = new Sample();
		s1.test();

		System.out.println("program e");


		
	}
}
