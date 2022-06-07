//parent
//Baseclass,Superclass,ParentClass
class Sample
{
	 int v1 = 123;
	 static String str = "hello";

	 public Sample()
	 {

	 }

	 public void test()
	{
		System.out.println("test() of Sample class");
	}

	 public static void view()
	{
		System.out.println("test() of Sample class");
	}
}

//child
//DerivedClass,Subclass,ChildClass
class Demo extends Sample
{
	double z1 = 3.45;

	public void display()
	{
		System.out.println("display() of Demo class");
	}
}


class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");

		Sample s1 = new Sample();
		System.out.println(s1.v1);
		s1.test();

		Demo d1 = new Demo();
		System.out.println(d1.z1);
		d1.display();

		System.out.println(d1.v1);
		d1.test();
		System.out.println(d1.str);
		d1.view();

		System.out.println("Program ends...");
	}
}