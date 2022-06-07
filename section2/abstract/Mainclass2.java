abstract class Runnable{
	abstract void hero();
	void zero()
	{
		System.out.println("zero() of Runnable");
	}
}
class Sample extends Runnable
{
	@Override
	public void hero()
	{
		System.out.println("Overriden method of Runnable");
	}
    void love()
    {
    	System.out.println("i love this world");
    	hero();
    	zero();
    }

}
class Mainclass2
{
	public static void main(String[] args) {
		Sample s = new Sample();
		s.love();

	}

}