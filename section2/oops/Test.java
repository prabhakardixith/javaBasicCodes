interface Test1
{
	int i=10;
	void hey();
	public static void hey1()
	{
		System.out.println();
	}
	public default void hello()
	{
		System.out.println("hello() of Test1 interface");
	}
}
class Test implements Test1
{	 	
	
	public void hey()
	{

	 System.out.println("Overriden method of Test1 interface : "+i);
	}
	public static void main(String[] args) 
	{
		
		Test t = new Test();
		t.hello();
		t.hey();
		
		
    }
}