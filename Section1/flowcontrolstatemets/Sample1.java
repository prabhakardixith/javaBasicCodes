class Sample1
{
	public static void small(int n)
	{
		int small=10,temp=0,temp1=0,small1=0,s=0;
        System.out.println("small after if "+n);

		     

		

		for(int i=1;n!=0;i++)
		{
			
		  temp=(n%10);
		  System.out.println("temp "+temp);
		  n=(n/10);
		  System.out.println("n "+n);
		  if(n>0)
		  {

		  


			 temp1=n%10;
		     System.out.println("temp1 "+temp1);

		 
		     if(temp<temp1)
		     {
		     	small=temp;
		        System.out.println("small if temp small "+small);

		     }
		     
		 
		 
		 

		     

		 
		}

		}
		System.out.println("small "+small);
	}
	public static void main(String[] args) {
		small(459);
	}

}