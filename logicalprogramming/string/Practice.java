class Practice
{
	
	public static void test(int num)
	{
     for (int i=0;i<=num ;i++ ) 
     {
     	for (int j=num;j>=i;j--)
     	{
          System.out.print(" ");
     	}
     		for(int k=1;k<=i;k++)
     		{
     		System.out.print(" *");
     		}
     		System.out.println();
     }
     q
	 	
	}
	public static void main(String[] args) 
	{
	 test(4);
	 
	}
}

