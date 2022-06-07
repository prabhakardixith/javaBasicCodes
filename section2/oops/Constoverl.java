class Constructor
{
	public Constructor()
	{
		System.out.println("Constructor with zero argument");
	}
	public Constructor(int a,int b)
	{
		System.out.println("arguments "+a+" , "+b);
	}
	public Constructor(double a,double b)
	{
		System.out.println("arguments "+a+" , "+b);
	}

}
class Constoverl
{
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(2,4);
		Constructor c2 = new Constructor(3.1,4.6);
		
	}
}