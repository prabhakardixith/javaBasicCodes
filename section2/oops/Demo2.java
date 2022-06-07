class Demo2
{
	double z1=3.25;// non static member
	static int v1=34;// static member 

	public void view()
	{
		System.out.println("this is view() of demo class");
	}

	public void show()
	{
		System.out.println("this is show() of demo class");
	}

	public static void display()
	{
		System.out.println("this is display() of demo class");
		System.out.println(new Demo().z1);
		new Demo().view();

	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		new Demo().view();
		Demo.display();
	}
}