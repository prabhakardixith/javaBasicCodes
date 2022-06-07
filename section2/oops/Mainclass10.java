class Demo
{
	static int b;
	public void sam()
	{
		System.out.println("sam of demo1"+b);
	}
}

class Demo1 extends Demo
{
	static int b;
	public void jam()
	{
		System.out.println("jam of demo1"+b);
	}
}
class Mainclass10 
{
	 int a;

	public void sample(int a)
	{
		this.a=a;
		System.out.println(a);


	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.sam();
		d.jam();

	}
}

