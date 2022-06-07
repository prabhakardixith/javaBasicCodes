class Method
{
	public void arguments()
	{
		System.out.println("functio of method class");
	}
	public void arguments(int a,int b)
	{
		System.out.println("values passed "+a+" , "+b);
	}
	public void arguments(double a,double b)
	{
		System.out.println("values passed "+a+" , "+b);
	}
	public void arguments(int a,double b)
	{
		System.out.println("values passed "+a+" , "+b);
	}
	

}
class Methodoverl
{
	public static void main(String[] args) {
		Method m = new Method();
		m.arguments();
		m.arguments(2,4);
		m.arguments(3.3,5.4);
		m.arguments(3,4.8);


		
	}

}