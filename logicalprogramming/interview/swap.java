
//without using 3rd variable in swaper1
class swap
{
	public static void swaper(int a,int b)
	{
		System.out.println("before swaping : "+a+" "+b);
		int temp=0;
		temp = a;
		a=b;
		b=temp;
		System.out.println("after swaping : "+a+" "+b);
	}
	//without using 3rd variable in swaper1
	public static void swaper1(int a,int b)
	{
		System.out.println("before swaping in swaper1 : "+a+" "+b);
		//a=12 b=11
		a=a+b;//12=12+11=23
		b=a-b;//11=23-11=12
		a=a-b;//23=23-12=11
		
		System.out.println("after swaping swaper1 : "+a+" "+b);
	}
	public static void main(String[] args) 
	{
	 int a=10,b=20;
	 swaper(a,b);
	 swaper1(12,11);

	}
}