class Method2
{
	public static int findavg(int a,int b,int c)
	{
		int avg;

		System.out.println("a = "+a+" b = "+b+" c = "+c);


		avg = (a+b+c)/3;

		return avg;
	}
	public static void main(String[] args)
	{
		int avg;

		avg = findavg(80,90,85);
		System.out.println("avg = "+avg);

		avg = findavg(75,65,51);
		System.out.println("avg = "+avg);


	}
}