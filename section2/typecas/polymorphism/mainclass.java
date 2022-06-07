class sample
{
	public void view()
	{
		System.out.println("view() of sample class");
	}
}
class demo extends sample
{
	@Override
	public void view()
	{
		System.out.println("overriden view() of demo class");
	}
}
class run extends sample
{
	@Override
	public void view()
	{
		System.out.println("overriden view() of run class");
	}
	public void hey()
	{
		System.out.println("hey");
	}
}
class mainclass{
	public static void call(sample ref)
	{
		ref.view();

	}
	public static void main(String[] args) {
		sample s = new demo();
		sample s1 = new run();
		
		call(s);
		call(s1);

	}

}