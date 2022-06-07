interface r{
 void hello();
 default void hey()
{

	System.out.println("hey");
}
 static void hi()
{

	System.out.println("hi");
}
}
class a implements r
{
	public void hello()
{
	System.out.println("hello of r");
}

}
class mainclass4
{
	public static void main(String[] args) {
		a a1 = new a();
		a1.hey();
		r.hi();
		a1.hello();
	
	}
}