class Demo
{
	double z1=3.25;// non static member
	static int v1=34;// static member 

	public void view()
	{
		System.out.println("this is view() of demo class");
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
      
      new Demo().view();//object creation
      System.out.println(new Demo().z1);// to access non static member have to create object
  }
}