class a
{
	public void hey()
	{
		System.out.println("hey");
	}
}
class b extends a
{
	public void say()
	{
		System.out.println("say");
	}
}
class c extends a
{
	public void hello()
	{
		System.out.println("hello");
	}

}
class mainclass5
{
	public static void main(String[] args) {
		//c c1 = new c();
		a a1 = new b();
		a1.hey();
		b c2 = (b)a1;

		
	}
}