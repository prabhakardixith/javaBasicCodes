//number which is divisible by only 1 and by it self
class Prime
{
	public static void primer(int num)
	{
  	int count=0;
  	for(int i=2;i<num;i++)
  	{
  		for(int j=1;j<i;j++)
        {
  		   if(i%j==0)
  		   {
  		   	count++;
  		   }
  		   
  		}

  		if(count == 1)
  		{
  			System.out.print(" "+i);
  		}
  		count=0;
  	}
  	
    }
	
	public static void main(String[] args) {
		
		primer(100);
		//primer(25);
		//primer(5);
		//primer(80);
	}
}
