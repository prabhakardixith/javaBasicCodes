class Flow5
{
	public static void printChar(int n,int a ,int d)
	{
	//System.out.println("input "+"num "+n+" c1 "+c);
	for(int c=a;c<=n;c++)
	{
		System.out.println(a);
		a+=d;
	}
	System.out.println();
	}
	public static void main(String[] args)
	{
		printChar(5,1,3);
	}
}