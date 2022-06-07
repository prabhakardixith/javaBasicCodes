abstract class ab
{
   int a=10;
   public void hey()
   {
   	System.out.println("say hey of ab");
   }
   abstract void say();
}
class ba extends ab
{
	static void hello()
	{
		System.out.println("hello of ba");
	}
	@Override
	public void say()
	{
		System.out.println("overriden method of ab class");

	}

}
class mainclass3
{
	public static void main(String[] args) {
		ba b = new ba();
		System.out.println(b.a);
		b.hey();
		ba.hello();//static method
		b.say();
	}
}
