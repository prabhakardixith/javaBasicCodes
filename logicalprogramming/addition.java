
//addition without + operator
class addition{
	public static void add(int a,int b)
	{
		int sum=a-(-b);//one way
		System.out.println(sum);
		while(b!=0)//another way
		{
			a++;
			b--;
		}
		System.out.println(a);

	}
	public static void main(String[] args) {
		add(10,20);
	}
	
}