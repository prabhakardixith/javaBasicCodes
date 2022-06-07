class prime2{
  public static void main(String[] args) 
  {
  	int num=49;
    int count=0;
    if(num==0 || num==1)
    {
    	System.out.println("not prime number ");
    }
    else
    {
  	for(int i=2;i<num;i++)
  	{
  		if(num%i == 0)
  		{
  			count++;
  		}

  	}
  	if(count == 0)
  		{
  				System.out.println(" prime Number");

  		}
  		else
  		{
  				System.out.println("not prime Number");

  		}
    
  }
  }
}