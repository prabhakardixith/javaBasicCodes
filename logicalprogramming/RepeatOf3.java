class RepeatOf3
{
	public void Tester(int num)
	{
		int count=0; 
		for(int i=0;i<=num;i++)
		{
			if(i%10 == 3 )
			{
				count++;
				System.out.println("count :"+ count +" "+i);
			}
			if(i/10 == 3 )
			{
				count++;
				System.out.println("count :"+ count +" "+i);
			}
		}
		System.out.println(count);

		
	}

	public static void main(String[] args) 
	{
		RepeatOf3 r = new RepeatOf3();
		r.Tester(40);
    }
}