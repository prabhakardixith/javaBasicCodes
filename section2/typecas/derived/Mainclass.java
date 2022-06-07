class Sample
{
	public void hey(){
		System.out.println("hey() of Sample class");
	}
}
class Run extends Sample
{
	public void hello()
	{
		System.out.println("hello() of Run class");
	}
}
class Demo extends Sample
{
	public void hi()
	{
		System.out.println("hi() of Demo class");
	}

}
class Mainclass
{
	public static void main(String[] args) {
		Demo d = new Demo();
		Sample s = d;//
		s.hey();// upcasting

		//Run r = (Run)s;
		//r.hey();
		Demo d1= (Demo)s;
		//d1= (Demo)s;
		d1.hi();
		d1.hey();
		//s.hey();

	}

}