class a
{
	static int p=10;
	public void hey()
	{
		System.out.println("hey() of a class");
	}
}
class b extends a
{
	static int p=20;
	@Override
	public void hey()
	{
		System.out.println("overriden hey() of b class");
		super.hey();
		System.out.println("p of b class "+p);
		System.out.println("p of a class "+super.p);

	}
}
class test
{
	public static void main(String[] args) 
	{
		a a1= new b();
		a1.hey();
		
		
	}
}