class Sample
{
	public static void small(int n)
	{
		int small=0,temp=0,temp1=0;
		

		for(int i=1;n!=0;i++)
		{
			
		  temp=(n%10);
		  System.out.println(""+temp);
		  n=(n/10);
		  System.out.println(""+n);

		}
	}
	public static void main(String[] args) {
		small(3214);
	}

}