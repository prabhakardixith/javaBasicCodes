class Test
{
	public  void hey() 
	{
   
	System.out.println("hey() of Test");
	}
}
class Test1 extends Test
{
	public  void hey() 
	{
		//String s=null;
		//System.out.println(s.length());
	System.out.println("hey() of Test1");
	}
	
	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.hey();
		Test t1 ;
		t1.hey();
		//Object obj = null;
		//System.out.println(obj.toString());

	   
	}
}