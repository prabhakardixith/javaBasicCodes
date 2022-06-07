class A
{
	B ref1;
	void hey()
	{
		System.out.println("hey");
	}

}
class B
{
	A ref;
	void hello()
	{
		System.out.println("hello");
	}
}
class Try
{
	public static void main(String[] args) {
		B ob =  new B();
		ob.ref = new A();
		ob.ref.hey();



	}
}