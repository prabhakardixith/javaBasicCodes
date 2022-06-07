class Sample
{
	public void hi()
	{
		System.out.println("hi() of sample class");
	}
}
class run extends Sample
{
	public void say()
	{
		System.out.println("say() pf run class");

	}
}
class run1 extends Sample
{
	public void hello()
	{
		System.out.println("hello() of run1 class");
	}
}
class mainclass6
{
	public static void show(Sample s)
	{
		System.out.println("s :"+s);
	}
	public static void main(String[] args)
	{
		System.out.println("program starts");

		Sample s1 = new Sample();
		show(s1);

		run r = new run();
		show(r);

		run1 r1 = new run1();
		show(r1);

		System.out.println("program ends");

	}

}