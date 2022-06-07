class Flow10
{
	public static void big(int n)
	{
		int b=0,t=0,t1=0;
		int bg=0;
		

		for(int i=1;n!=0;i++)
		{
			if(n>0)
			{

		  b=(n%10);
		  //System.out.println(""+b);
		  n=(n/10);
		  //System.out.println(""+n);
		  t=n%10;
		  //System.out.println(""+t);

		  if(b>t)
		    {
			 t1=b;
			
			 //System.out.println("big "+t1);

		    }
		    //System.out.println("big "+bg);

		    
		      if(t1>bg)
		      {
		      	bg=t1;
			
			  //System.out.println("big "+t1);
			  

		       }
		       //System.out.println("big "+bg);
		     }
		 }
		System.out.println("big "+bg);
	}
	public static void main(String[] args) {
		big(5789);
	}

}