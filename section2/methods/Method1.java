class Method1
{
	public static double findsi(double p,double t,double r)// accept inputs
	// method iS a set of code to perform reccuring operations
	{
		double si;

		si=p*t*r/100;// process

		return si; // method should return processed data
	}
	public static void main(String[] args)
	{
		Double si;

		si = findsi(100,1.5,3.6); // way of calling mathods

		System.out.println(si);

		si = findsi(200,4.2,7.8);// we can call methods n number of times

		System.out.println(si);
	}
}