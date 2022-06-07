class Demo
{
	public void test(int n)//method overriding
	{
	   System.out.println("Demo class "+"input = "+n);
	   for(int i=1;i<=n;i++)
	   {
	   	System.out.println(i);
	   }
	}
}
class Sample extends Demo
{
	@Override//override annotation
	public void test(int n)//method overriding
	{
	System.out.println("Sample class "+"input = "+n);
	   for(int j=n;j>=1;j--)
	   {
	   	System.out.println(j);
	   }
	}
}
class Mainclass
{
	public static void main(String[] args) {
		Sample s = new Sample();
		Demo d = new Demo();
		d.test(5);
		s.test(5);
	}
}