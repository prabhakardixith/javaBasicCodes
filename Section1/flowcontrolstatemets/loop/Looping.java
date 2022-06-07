class Looping
{
	public int looper1(int num)
	{
	int rem=0;
		do
		{
			rem=num%10;
			//System.out.println(rem);
			return rem;
			num=num/10;
			//System.out.println(num+ " : num");
			

		}
		while(num>0);
    }
	public  void looper(int num)
	{
		int res = looper1(num);
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		int num=101;
		Looping lp = new Looping();

		lp.looper(num);
	}
}