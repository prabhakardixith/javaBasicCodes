class Flow6
{
	public static void big(int n)
	{
		int b=0,t=0,t1=0;
		int bg=0;
		

		for(int i=1;n!=0;i++)
		{

		  b=(n%10);
		  n=(n/10);
		  t=n%10;
		  if(b>t)
		  {
			t1=b;
		  }
		  if(t1>bg)//t1
		  {
		    bg=t1;
			System.out.println("big number is = "+t1);
		  }
		  
		}
		
	}
	public static void main(String[] args) {
		big(5789);
	}

}