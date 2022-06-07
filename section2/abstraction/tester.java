interface r
{
	void hey();
	void hello();
}
class a implements r
{
	@Override
	public void hey()
	{
		System.out.println("hey() of a ");
	}
	@Override
	public void hello()
	{
		System.out.println("hello() of a");
	}
}
class b implements r
{
	@Override
	public void hey()
	{
		System.out.println("hey() of b ");
	}
	@Override
	public void hello()
	{
		System.out.println("hello() of b");
	}
}

class service
{
	static r refer(String s)
	{
		if(s.equalsIgnoreCase("a"))
		{
			r ref = new a();
			return ref;
		}
		else if(s.equalsIgnoreCase("b"))
		{
			r ref = new b();
			return ref; 
		}
		return null;

	}
}
class tester
{
	public static void main(String[] args) 
	{
		r ref = service.refer("a");
		ref.hey();
		r ref1 = service.refer("b");
		ref1.hey();
		

	}
}