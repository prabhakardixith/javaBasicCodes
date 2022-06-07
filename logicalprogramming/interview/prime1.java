
//print all the prime numbers in given number

class Prime1
{
  /*
	public static void test(int n) 
   { 
    int count=0; 
    for(int i=2;i<=n;i++) 
     { 
      for(int j=2;j<=i-1;j++) 
      { 
       if(i%j==0) 
      { 
      count++; 
      } 
     } 

   if(count==0) 
   {  
    System.out.print(i+" "); 
   } 
   else 
   { 
    count=0; 
   } 
  } 
  
  }
  */
    public static void main(String[] args)
  { 
 
   test(36); 
  }
   

  
  public static void test(int num)
  {
  	
  	int count=0;
  	System.out.print(2+" "+3+" "+5+" ");
  	for(int i=5;i<num;i++)
  	{
  		//System.out.println("value : "+i);
  		//if(i>5 && i%5==0)
      //    continue;
  		if(i%2==0 || i%3==0 ||i%5==0)
  		{
        
  			count++;
  		}
  		if(count==0)
  		{
  			System.out.print(i + " " );
  		}
  		else
  		{
  			count=0;
  		}
  	}
  }
}
 
  
 