class Flow4
{
	public static void printChar(char c,int n)
	{
	System.out.println("input "+"num "+n+" c1 "+c);
	for(int cc=1;cc<=n;cc++)
	{
		System.out.print(c++ +" ");
	}
	System.out.println();
	}
	public static void main(String[] args)
	{
		printChar('A',5);
	}
}