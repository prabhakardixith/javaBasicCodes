class Program5{
	public static void main(String[] args)
	{
		int a1=5;
		int b1=5;
		int r1;
		int r2;

		System.out.println("a1 ="+a1);
		r1= ++a1 + 5;  //preincrement
		System.out.println("r1 ="+r1);
		System.out.println("a1 ="+a1);

		System.out.println("b1 ="+b1);
		r2= b1++ + 5;//postincrement
		System.out.println("r2 ="+r2);
		System.out.println("b1 ="+b1);
	}
}