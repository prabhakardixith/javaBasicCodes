class Method4
{
	public static void findsi(double p,double t,double r)//called method
	{
		double si;

		si = (p*t*r)/100;

		System.out.println("simple interest ="+si);

		//when we write return it takes execution control to main method


		//when return type is void you dont need to write return and value

	}
	public static void main(String[] args)
	{
		
		findsi(40,56.5,67);//calling method

		findsi(15,22.6,89);// when call method it take exexution control to the methods
	}
}